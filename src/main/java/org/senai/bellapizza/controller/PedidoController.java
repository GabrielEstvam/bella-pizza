package org.senai.bellapizza.controller;

import org.senai.bellapizza.entity.Pedido;
import org.senai.bellapizza.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/pedido")
@CrossOrigin("*")
public class PedidoController 
{

    @Autowired
    PedidoRepository pRepository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Pedido pedido) 
    {
        pRepository.save(pedido);
        return pedido.getIdPedido();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Pedido> buscar() 
    {
        return pRepository.findAll();
    }

}

