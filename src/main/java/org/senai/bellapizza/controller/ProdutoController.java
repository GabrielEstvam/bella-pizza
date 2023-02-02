package org.senai.bellapizza.controller;

import org.senai.bellapizza.entity.Produto;
import org.senai.bellapizza.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/produto")
@CrossOrigin("*")
public class ProdutoController 
{

    @Autowired
    ProdutoRepository pRepository;

    @PostMapping("/")
    public @ResponseBody Integer addProduto(@RequestBody Produto produto) 
    {
        pRepository.save(produto);
        return produto.getIdProduto();
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Produto> buscar() 
    {
        return pRepository.findAll();
    }

}

