package br.com.gerson.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.gerson.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
	@Query(value = "select "
				 	+ "p.id_pessoa, "
				 	+ "p.id_curso, "
				 	+ "p.nome, "
				 	+ "p.cpf, "
				 	+ "p.data_nasc, "
				 	+ "c.nome as curso, "
				 	+ "m.valor as mensalidade "
				 + "from "
				 	+ "pessoa p, "
				 	+ "curso c, "
				 	+ "mensalidade m "
				 + "where "
			        + "p.id_curso = c.id_curso "
			     + "and "
			        + "c.id_mensalidade = m.id_mensalidade "
			     + "and "
			        + "p.id_curso = :curso "
			     + "and "
			        + "p.data_nasc = :dataNasc",  
	  countQuery = "select "
				 	+ "p.id_pessoa, "
				 	+ "p.id_curso, "
				 	+ "p.nome, "
				 	+ "p.cpf, "
				 	+ "p.data_nasc, "
				 	+ "c.nome as curso, "
				 	+ "m.valor as mensalidade "
				 + "from "
				 	+ "pessoa p, "
				 	+ "curso c, "
				 	+ "mensalidade m "
				 + "where "
			        + "p.id_curso = c.id_curso "
			     + "and "
			        + "c.id_mensalidade = m.id_mensalidade "
			     + "and "
			        + "p.id_curso = :curso "
			     + "and "
			        + "p.data_nasc = :dataNasc",
	 nativeQuery = true)
	Page<Pessoa> listaPorPessoa(@Param("curso") Integer curso, @Param("dataNasc") String dataNasc, Pageable pageable);

}