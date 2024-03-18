package br.com.lavajatocarioca.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Entidade Cliente.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Entity
@Table(name = "clientes")
public class Cliente {
  @Id
  @GeneratedValue
  private Long id;

  @NotBlank(message = "O telefone deve ser informado.")
  @Column(length = 15, unique = true)
  private String telefone;

  @NotBlank(message = "O nome deve ser informado.")
  @Column(nullable = false)
  private String nome;

  @OneToMany(mappedBy = "cliente")
  private List<Veiculo> veiculos;

  /**
   * @return {@link #id}
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id atualiza {@link #id}.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return {@link #telefone}
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * @param telefone atualiza {@link #telefone}.
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * @return {@link #nome}
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome atualiza {@link #nome}.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return {@link #veiculos}
   */
  public List<Veiculo> getVeiculos() {
    return veiculos;
  }

  /**
   * @param veiculos atualiza {@link #veiculos}.
   */
  public void setVeiculos(List<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }

}
