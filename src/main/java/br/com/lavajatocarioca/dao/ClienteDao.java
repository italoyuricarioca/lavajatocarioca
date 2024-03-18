package br.com.lavajatocarioca.dao;

import java.util.List;

import br.com.lavajatocarioca.entidades.Cliente;

/**
 * Clientes DAO Interface.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
public interface ClienteDao {
  void adiciona(Cliente cliente);

  void altera(Cliente cliente);

  void remove(Cliente cliente);

  List<Cliente> todos();

  Cliente porFone(String telefone);

  Cliente porNome(String nome);
}
