package br.com.barrostech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.barrostech.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long> {

}
