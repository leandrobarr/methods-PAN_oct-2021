package com.crud.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoServiceImpl implements ProdutoService {
	
	private static Map<String, Produto> produtoRepository = new HashMap<>();
     static {
    	 //mocka um produto chocolate
    	 Produto chocolate = new Produto();
    	 chocolate.setId("1");
    	 chocolate.setNome("Chocolate");
    	 produtoRepository.put(chocolate.getId(), chocolate);
    	 
    	 //localhost:8089/api/listar
    	 //mocka um produto trufa
    	 Produto trufa = new Produto();
    	 chocolate.setId("2");
    	 chocolate.setNome("Trufa");
    	 produtoRepository.put(trufa.getId(), trufa); 
    		 
     }
    	 
    	 //salva
    	 @Override
    	 public void createProduto(Produto produto) {
    		 produtoRepository.put(produto.getId(), produto);
    	 }
    	 
    	 //deleta
    	 @Override
    	 public void deleteProduto(String id) {
    		 produtoRepository.remove(id);
    	 }
    	 
    	 @Override
    	 public Collection<Produto> getProduto() {
    		 return produtoRepository.values();
    	 }
    	 
     }

