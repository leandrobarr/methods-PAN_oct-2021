package model;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Tarefas {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@Id
	private Long id;

	@Column(nullable = false)
	private String tarefa;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdAt;

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;

	// getters e setters

}
