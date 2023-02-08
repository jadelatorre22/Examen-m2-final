package com.pluralcamp.demo.exceptions;

public class ResourceNotFoundException extends Exception {
	
	//Las excepciones han de ser serializadas
	//que se puedan enviar por disco o enviar por la red(que tmbn guarda en dico)
	//Por ejemplo: cuando queremos hacer un log de la excepción
	//Por ejemplo: se quiere enviar una excepción al cliente
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}

