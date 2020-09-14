package com.agenciamacro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bus {

	@Id
	String id;
	String placa;
	String disponivel;
	
	public Bus(String placa, String disponivel) {
		this.placa=placa;
		this.disponivel=disponivel;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	

	@Override
	public String toString() {
		return "Bus : ID=["+id+"] / PLACA["+placa+"] / DISPONIVEL=["+disponivel+"]";
	}
	
}
