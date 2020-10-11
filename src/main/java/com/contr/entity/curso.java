package com.contr.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "curso")
public class curso {
	@Id
private String id;
private String nombre;
private String creditos;


public curso() {
	super();
	// TODO Auto-generated constructor stub
}

public curso( String nombre, String creditos) {
	super();

	this.nombre = nombre;
	this.creditos = creditos;
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

public String getCreditos() {
	return creditos;
}

public void setCreditos(String creditos) {
	this.creditos = creditos;
}

}
