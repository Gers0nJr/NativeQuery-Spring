package br.com.gerson.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.gerson.model.Pessoa;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PagamentoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_nasc")
	private Date dataNasc;
	
	private String curso;
	private Double mensalidade;
	
	public PagamentoDTO(){	
	}

	public PagamentoDTO(Pessoa p) {
		
		this.nome = p.getNome();
		this.cpf = p.getCpf();
		this.dataNasc = p.getDataNasc();
		this.curso = p.getCurso();
		this.mensalidade = p.getMensalidade();
				
	}
}
