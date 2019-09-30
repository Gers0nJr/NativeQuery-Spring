package br.com.gerson.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @ Setter @EqualsAndHashCode
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id_curso;
	private String nome;
	private Integer id_mensalidade;

}
