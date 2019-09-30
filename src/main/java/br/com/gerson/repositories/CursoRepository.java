package br.com.gerson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gerson.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
