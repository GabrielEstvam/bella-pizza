package org.senai.bellapizza.repository;

import org.senai.bellapizza.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer>
{
    
}    

