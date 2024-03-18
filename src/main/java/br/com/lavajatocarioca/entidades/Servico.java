package br.com.lavajatocarioca.entidades;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
 * Entidade Serviço.
 *
 * @author Ítalo Yuri Marques De Souza
 * @version 1.0
 */
@Entity
@Table(name = "servicos")
public class Servico {
  @Id
  @GeneratedValue
  private Long id;

  @Digits(integer = 10, fraction = 2)
  @Column(nullable = false, columnDefinition = "Decimal(10,2)")
  private BigDecimal preco;

  @NotNull
  @Column(nullable = false, length = 30)
  private String descricao;

  @NotNull
  @Column(nullable = false, length = 25)
  private String previsao_entrega;

  @Column(insertable = false, updatable = false,
          columnDefinition = "timestamp default current_timestamp")
  @Temporal(TemporalType.TIMESTAMP)
  private Date data_servico;

  @ManyToOne
  @JoinColumn(name = "placa", nullable = false)
  private Veiculo veiculo;

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
   * @return {@link #preco}
   */
  public BigDecimal getPreco() {
    return preco;
  }

  /**
   * @param preco atualiza {@link #preco}.
   */
  public void setPreco(BigDecimal preco) {
    this.preco = preco;
  }

  /**
   * @return {@link #descricao}
   */
  public String getDescricao() {
    return descricao;
  }

  /**
   * @param descricao atualiza {@link #descricao}.
   */
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  /**
   * @return {@link #previsao_entrega}
   */
  public String getPrevisao_entrega() {
    return previsao_entrega;
  }

  /**
   * @param previsao_entrega atualiza {@link #previsao_entrega}.
   */
  public void setPrevisao_entrega(String previsao_entrega) {
    this.previsao_entrega = previsao_entrega;
  }

  /**
   * @return {@link #data_servico}
   */
  public Date getData_servico() {
    return data_servico;
  }

  /**
   * @param data_servico atualiza {@link #data_servico}.
   */
  public void setData_servico(Date data_servico) {
    this.data_servico = data_servico;
  }

  /**
   * @return {@link #veiculo}
   */
  public Veiculo getVeiculo() {
    return veiculo;
  }

  /**
   * @param veiculo atualiza {@link #veiculo}.
   */
  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

}
