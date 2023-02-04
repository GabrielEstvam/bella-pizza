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
    private Integer produto;
    public Integer getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Integer idPedido) {
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
    public Integer getProduto() {
        return produto;
    }
    public void setProduto(Integer produto) {
        this.produto = produto;
    }

   
    
}
