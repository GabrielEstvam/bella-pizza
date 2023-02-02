package org.senai.bellapizza.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idPedido;
    private String nomeCliente;
    private String enderecoCliente;

    public Integer getIdPedido() 
    {
        return idPedido;
    }
    public void setIdPedido(Integer idPedido) 
    {
        this.idPedido = idPedido;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public Double getValorPedido() {
        return valorPedido;
    }
    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    private Double valorPedido;
    private String produto;
    
    
}
