package com.contr.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryExtension;


@Document(collection = "alumno")
public class alumno {
	@Id	
private String id;
private String nombre;
private String dni;
private String codigo;
private String telefono;


public alumno() {
	super();
	// TODO Auto-generated constructor stub
}


public alumno(String nombre, String dni, String codigo, String telefono) {
	super();
	this.nombre = nombre;
	this.dni = dni;
	this.codigo = codigo;
	this.telefono = telefono;
}






public String getid() {
	return id;
}


public void setid(String id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

}
