package br.com.barrostech.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 4701423217936418863L;
	
	public LivroNaoEncontradoException(String mensagem) {
		super(mensagem);
		
	}

	public LivroNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem,causa);
		
	}
	
	

}
