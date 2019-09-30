package br.com.gerson.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerson.dto.PagamentoDTO;
import br.com.gerson.model.Pessoa;
import br.com.gerson.services.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	public ResponseEntity<Page<PagamentoDTO>> listAll(@RequestBody Pessoa pessoa, Pageable pageable) throws ParseException {
		
		return pessoaService.listBy(pessoa, pageable);
		
	}

}
