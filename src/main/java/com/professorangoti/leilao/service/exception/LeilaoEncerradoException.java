package com.professorangoti.leilao.service.exception;

public class LeilaoEncerradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LeilaoEncerradoException() {
		super("Leilao Encerrado!");
	}

}
