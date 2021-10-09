package com.classes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.classes.repository.ProdutosRepository;
import com.classes.tabelas.Produtos;

@RestController
@CrossOrigin("*")
public class Controller {

	@GetMapping("/retornoString")
	public String metodo() {
		return "hello";
	}

	@GetMapping("/retornoNumero")
	public int idade() {
		return 1;
	}

	@Autowired
	private ProdutosRepository repository;

	@GetMapping("/produtos")
	public List<Produtos> buscarTodos() {
		return repository.findAll();
	}

}
