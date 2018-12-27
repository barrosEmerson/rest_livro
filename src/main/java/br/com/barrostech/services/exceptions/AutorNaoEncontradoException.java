package br.com.barrostech.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 4701423217936418863L;
	
	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
		
	}

	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem,causa);
		
	}
	
	

}
