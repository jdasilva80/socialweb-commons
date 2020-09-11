package com.jdasilva.socialweb.commons.models.usuarios.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "contactos", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "usuario_id", "contacto_usuario_id" }) })
public class Contacto implements Serializable {

	private static final long serialVersionUID = -5091140348799530688L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;

	@JoinColumn(nullable = false, updatable = false, foreignKey = @ForeignKey(name = "Fk_contactos_usuario_id"))
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Usuario usuario;

	@JoinColumn(nullable = false, updatable = false, foreignKey = @ForeignKey(name = "Fk_contactos_contacto_usuario_id"))
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Usuario contactoUsuario;

	@Transient
	private Long usuarioId;
	@Transient
	private String nombre;
	@Transient
	private String apellidos;
	@Transient
	private String username;
	@Transient
	private String email;
	@Transient
	private Date fechaNacimiento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getContactoUsuario() {
		return contactoUsuario;
	}

	public void setContactoUsuario(Usuario contactoUsuario) {
		this.contactoUsuario = contactoUsuario;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@PostLoad
	public void postLoad() {

		usuarioId = contactoUsuario.getId();
		nombre = contactoUsuario.getUsername();
		apellidos = contactoUsuario.getApellidos();
		username = contactoUsuario.getUsername();
		email = contactoUsuario.getEmail();
		fechaNacimiento = contactoUsuario.getFechaNacimiento();
	}
}
