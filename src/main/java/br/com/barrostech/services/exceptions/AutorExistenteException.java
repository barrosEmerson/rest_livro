package br.com.barrostech.services.exceptions;

public class AutorExistenteException extends RuntimeException {

	private static final long serialVersionUID = 4701423217936418863L;
	
	public AutorExistenteException(String mensagem) {
		super(mensagem);
		
	}

	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem,causa);
		
	}
	
	

}
