package br.gov.sp.fatec.aluguelspringapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RegistroNaoEcontradoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3014661319427003142L;
	public  RegistroNaoEcontradoException() {
		super();
	}
	
	public RegistroNaoEcontradoException(String message) {
		super(message);
	}
	public RegistroNaoEcontradoException(Throwable cause) {
		super(cause);
	}
	public RegistroNaoEcontradoException(String message, Throwable cause) {
		super(message,cause);
	}
	
}
