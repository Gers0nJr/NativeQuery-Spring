package br.com.gerson.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @ Setter @EqualsAndHashCode
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_pessoa")
	private Integer idPessoa;
	private String nome;
	private String cpf;
	
	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "America/Sao_Paulo")
	@Column(name = "data_nasc")
	private Date dataNasc;
	
	@Column(name = "id_curso")
	private Integer idCurso;
	
	private String curso;
	private Double mensalidade;
	
}
