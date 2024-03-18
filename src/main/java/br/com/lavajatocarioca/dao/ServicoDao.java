package br.com.lavajatocarioca.dao;

import java.util.List;

import br.com.lavajatocarioca.entidades.Servico;

/**
 * Servico DAO Interface.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
public interface ServicoDao {
  void adiciona(Servico servico);

  void altera(Servico servico);

  void remove(Servico servico);

  List<Servico> todos();

  Servico porTelefone(String f);
}
