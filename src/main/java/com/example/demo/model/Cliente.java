package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int num_cuenta;
	private double balance;
	
	public Cliente(int id, String nombre, String apellido1, String apellido2, int num_cuenta, double balance) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.num_cuenta = num_cuenta;
		this.balance = balance;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", num_cuenta=" + num_cuenta + ", balance=" + balance + "]";
	}
	
	
	
	
}
