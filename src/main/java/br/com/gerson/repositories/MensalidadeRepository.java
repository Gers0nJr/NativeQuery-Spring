package br.com.gerson.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gerson.model.Mensalidade;

public interface MensalidadeRepository extends JpaRepository<Mensalidade, Integer>{

}
