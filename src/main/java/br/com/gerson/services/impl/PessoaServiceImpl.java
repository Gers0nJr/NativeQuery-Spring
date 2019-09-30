package br.com.gerson.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.gerson.dto.PagamentoDTO;
import br.com.gerson.model.Pessoa;
import br.com.gerson.repositories.PessoaRepository;
import br.com.gerson.services.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public ResponseEntity<Page<PagamentoDTO>> listBy(Pessoa pessoa, Pageable pageable) throws ParseException{

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String dataNasc = dateFormat.format(pessoa.getDataNasc());

		Page<Pessoa> list = pessoaRepository.listaPorPessoa(pessoa.getIdCurso(), dataNasc, pageable);
		Page<PagamentoDTO> listDTO = list.map(obj -> new PagamentoDTO(obj));  
		
		return new ResponseEntity<Page<PagamentoDTO>>(listDTO, HttpStatus.OK);
		
	}

}
