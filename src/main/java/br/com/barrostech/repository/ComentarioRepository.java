package br.com.barrostech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.barrostech.domain.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
