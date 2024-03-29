package br.com.lavajatocarioca.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.lavajatocarioca.entidades.Servico;

/**
 * Servico DAO.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Repository
public class JPAServicoDao
  implements ServicoDao {

  @PersistenceContext
  EntityManager manager;

  public void adiciona(Servico servico) {
    manager.persist(servico);
  }

  public void altera(Servico servico) {
    manager.merge(servico);
  }

  public void remove(Servico servico) {
    manager.remove(servico);
  }

  public List<Servico> todos() {
    return manager.createQuery("from Servico", Servico.class)
        .getResultList();
  }

  public Servico porTelefone(String f) {
    return manager.find(Servico.class, f);
  }
}
