package br.com.gerson.services;

import java.text.ParseException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import br.com.gerson.dto.PagamentoDTO;
import br.com.gerson.model.Pessoa;

public interface PessoaService {
	
	public ResponseEntity<Page<PagamentoDTO>> listBy(Pessoa pessoa, Pageable pageable) throws ParseException;

}
