package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.TarefasModel;
//import com.example.demo.model.ClientesModel;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {

	// lista tabela procurar por tarefa ignorando case (tarefa)
	public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);

	public List<TarefasModel> findByTarefaAndId(String tarefa, Long id);

	@Query(value = "SELECT * FROM TAREFA_MODEL", nativeQuery = true)
	List<TarefasModel> procuraTodos();

}
