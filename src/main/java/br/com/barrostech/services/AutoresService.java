package br.com.barrostech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.barrostech.domain.Autor;
import br.com.barrostech.repository.AutoresRepository;
import br.com.barrostech.services.exceptions.AutorExistenteException;
import br.com.barrostech.services.exceptions.AutorNaoEncontradoException;

@Service
public class AutoresService {

	@Autowired
	private AutoresRepository autorRepository;
	
	public List<Autor> listar(){
		return autorRepository.findAll();
		
	}
	
	public Autor salvar(Autor autor) {
		if(autor.getId() !=null) {
			Autor a = autorRepository.findOne(autor.getId());
			
			if(a != null) {
				throw new AutorExistenteException("O autor já existe!");
			}
		}
		return autorRepository.save(autor);
	}
	
	public Autor buscar(Long id) {
		Autor autor = autorRepository.findOne(id);
		
		if (autor == null) {
			throw new AutorNaoEncontradoException("O autor não pôde ser encontrado");
		}
		return autor;
	}
}
