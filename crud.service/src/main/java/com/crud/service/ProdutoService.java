package com.crud.service;

import java.util.Collection;

public interface ProdutoService {

	public void createProduto(Produto produtinho);

	public void deleteProduto(String id);

	public Collection<Produto> getProduto();

}
