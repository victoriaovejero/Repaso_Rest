package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Cliente;


public interface IClienteService {
	
	public void add(Cliente cliente );
	public List <Cliente> list_all ();
	public Cliente find_by_id(int id);
	public void modificar_cliente(Cliente cliente);
	public void delete(int cliente);


}
