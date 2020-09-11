package com.jdasilva.socialweb.commons.models.productos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String nombre;

	@NotNull
	private Double precio;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;

	@Valid
	@NotNull // para validar en los servicios rest not null
	private Categoria categoria;

	private String foto;

	public Producto() {

	}

	public Producto(@NotEmpty String nombre, @NotNull Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(@NotEmpty String nombre, @NotNull Double precio, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public Producto(@NotEmpty String nombre, @NotNull Double precio, Categoria categoria, String foto) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.foto = foto;
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
