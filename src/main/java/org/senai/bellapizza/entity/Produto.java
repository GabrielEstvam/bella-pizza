package org.senai.bellapizza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idProduto;
    private String nomeProduto;
    private Double valorProduto;
    private String descricaoProduto;
    
    public Integer getIdProduto() 
    {
        return idProduto;
    }
    public void setIdProduto(Integer idProduto) 
    {
        this.idProduto = idProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
}
