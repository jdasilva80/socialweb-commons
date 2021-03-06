package com.jdasilva.socialweb.commons.models.document;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categorias")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@NotEmpty
	private String id;

	private String nombre;

	public Categoria() {

	}

	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
