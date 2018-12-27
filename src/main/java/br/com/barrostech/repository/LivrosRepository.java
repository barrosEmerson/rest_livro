package br.com.barrostech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.barrostech.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {


}
