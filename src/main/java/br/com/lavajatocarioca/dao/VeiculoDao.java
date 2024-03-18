package br.com.lavajatocarioca.dao;

import java.util.List;

import br.com.lavajatocarioca.entidades.Veiculo;

/**
 * Veículo DAO Interface.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
public interface VeiculoDao {
  void adiciona(Veiculo veiculo);

  void altera(Veiculo veiculo);

  void remove(Veiculo veiculo);

  List<Veiculo> todos();

  Veiculo porPlaca(String f);
}
