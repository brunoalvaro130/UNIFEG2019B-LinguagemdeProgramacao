package br.edu.unifeg.orcamento;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class TipoProduto {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long   id; //PK - long
  private String codigo;
  private String tipoProduto;

  // metodos de acesso ao
  public Long getId() {
    return this.id;
  }
  public void setId(Long id){
    this.id = id;
  }

  public String getCodigo() {
    return this.codigo;
  }
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }

  public String getTipoProduto() {
    return this.tipoProduto;
  }
  public void setTipoProduto(String TipoProduto){
    this.tipoProduto = tipoProduto;
  }

}
