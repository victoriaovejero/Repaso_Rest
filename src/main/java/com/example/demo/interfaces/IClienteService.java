package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Cliente;


public interface IClienteService {
	
	public void add(Cliente cliente );
	public List <Cliente> listAll ();
	public Cliente findCliente(int id);
	void modifyCliente(Cliente cliente);
	void delete(int id);



}
