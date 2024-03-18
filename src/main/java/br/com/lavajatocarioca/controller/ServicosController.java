package br.com.lavajatocarioca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lavajatocarioca.dao.ClienteDao;
import br.com.lavajatocarioca.dao.ServicoDao;
import br.com.lavajatocarioca.dao.VeiculoDao;
import br.com.lavajatocarioca.entidades.Servico;
import br.com.lavajatocarioca.entidades.Veiculo;

/**
 * Serviços Controller.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Controller
public class ServicosController {

  @Autowired
  ServicoDao servicodao;
  @Autowired
  VeiculoDao veiculodao;
  @Autowired
  ClienteDao clientedao;

  @RequestMapping("/novo-servico")
  public String nova() {
    return ("cadastro/pre_cadastro_servico");
  }

  @RequestMapping("/lista-servicos")
  public String listar(Model model) {
    model.addAttribute("servicos", servicodao.todos());
    return ("listagem/lista_servico");
  }

  @RequestMapping("pre-busca-veiculo")
  public ModelAndView cad_servico_etapa2(Veiculo veiculo) {
    veiculo = veiculodao.porPlaca(veiculo.getPlaca());
    if (veiculo == null) {
      String mensagem = "O ve�culo ainda n�o foi cadastrado!";
      ModelAndView mv = new ModelAndView("cadastro/pre_cadastro_servico");
      mv.addObject("erro", mensagem);
      return mv;
    } else {
      ModelAndView mv = new ModelAndView("cadastro/cadastro_servico");
      mv.addObject("veiculo", veiculo);
      return (mv);
    }
  }

  @Transactional
  @RequestMapping("salvar-servico")
  public String cadastra(Servico servico, String placa) {
    servico.setVeiculo(veiculodao.porPlaca(placa));
    servicodao.adiciona(servico);
    return ("index");
  }

}
