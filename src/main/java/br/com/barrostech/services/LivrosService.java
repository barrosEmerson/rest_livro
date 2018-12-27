package br.com.barrostech.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.barrostech.domain.Comentario;
import br.com.barrostech.domain.Livro;
import br.com.barrostech.repository.ComentarioRepository;
import br.com.barrostech.repository.LivrosRepository;
import br.com.barrostech.services.exceptions.LivroNaoEncontradoException;

@Service
public class LivrosService {

	@Autowired
	private LivrosRepository lr;
	
	@Autowired
	private ComentarioRepository comentarioRepository;

	public List<Livro> listar() {
		return lr.findAll();
	}

	public Livro buscar(Long id) {
		Livro livro = lr.findOne(id);

		if (livro == null) {
			throw new LivroNaoEncontradoException("O livro não pôde ser encontrado!");
		}
		return livro;
	}

	public Livro salvar(Livro livro) {
		livro.setId(null);
		return lr.save(livro);
	}

	public void deletar(Long id) {
		try {
			lr.delete(id);
		} catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("O livro não pôde ser encontrado!");
		}
	}
	
	public void atualizar(Livro livro) {
		verificarExistecia(livro);
		lr.save(livro);
	}
	
	private void verificarExistecia(Livro livro) {
		buscar(livro.getId());
	}
	
	public Comentario salvarComentario(Long livroId, Comentario comentario) {
		Livro livro = buscar(livroId);
		comentario.setLivro(livro);
		comentario.setData(new Date());
		
		return comentarioRepository.save(comentario);
	}
	
	public List<Comentario> listarComenterios(Long livroId){
		Livro livro = buscar(livroId);
		
		return livro.getComentarios();
	}

}
