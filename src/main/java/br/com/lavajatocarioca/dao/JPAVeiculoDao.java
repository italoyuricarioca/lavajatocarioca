package br.com.lavajatocarioca.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.lavajatocarioca.entidades.Veiculo;

/**
 * Veículo DAO.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Repository
public class JPAVeiculoDao
  implements VeiculoDao {

  @PersistenceContext
  EntityManager manager;

  public void adiciona(Veiculo veiculo) {
    manager.persist(veiculo);
  }

  public void altera(Veiculo veiculo) {
    manager.merge(veiculo);
  }

  public void remove(Veiculo veiculo) {
    manager.remove(veiculo);
  }

  public List<Veiculo> todos() {
    return manager.createQuery("from Veiculo", Veiculo.class)
        .getResultList();
  }

  public Veiculo porPlaca(String f) {
    return manager.find(Veiculo.class, f);
  }
}
