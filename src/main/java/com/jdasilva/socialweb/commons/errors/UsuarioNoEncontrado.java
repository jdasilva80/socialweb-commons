package com.jdasilva.socialweb.commons.errors;

public class UsuarioNoEncontrado extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontrado(String identificador) {

		super("Usuario ".concat(identificador).concat(" no existe en la base de datos"));
	}

}
