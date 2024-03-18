package br.com.lavajatocarioca.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entidade Veículo.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Entity
@Table(name = "veiculos")
public class Veiculo {

  @Id
  @Column(length = 8)
  private String placa;

  @Column(nullable = false, length = 50)
  private String cor;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Tipo tipo;

  @Column(nullable = false, length = 100)
  private String modelo;

  @ManyToOne
  @JoinColumn(name = "cliente_id", nullable = false)
  private Cliente cliente;

  /**
   * @return {@link #placa}
   */
  public String getPlaca() {
    return placa;
  }

  /**
   * @param placa atualiza {@link #placa}.
   */
  public void setPlaca(String placa) {
    this.placa = placa;
  }

  /**
   * @return {@link #cor}
   */
  public String getCor() {
    return cor;
  }

  /**
   * @param cor atualiza {@link #cor}.
   */
  public void setCor(String cor) {
    this.cor = cor;
  }

  /**
   * @return {@link #tipo}
   */
  public Tipo getTipo() {
    return tipo;
  }

  /**
   * @param tipo atualiza {@link #tipo}.
   */
  public void setTipo(Tipo tipo) {
    this.tipo = tipo;
  }

  /**
   * @return {@link #modelo}
   */
  public String getModelo() {
    return modelo;
  }

  /**
   * @param modelo atualiza {@link #modelo}.
   */
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  /**
   * @return {@link #cliente}
   */
  public Cliente getCliente() {
    return cliente;
  }

  /**
   * @param cliente atualiza {@link #cliente}.
   */
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

}
