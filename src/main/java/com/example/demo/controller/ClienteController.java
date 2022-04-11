package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.IClienteService;
import com.example.demo.model.Cliente;

@RestController
public class ClienteController {

	@Autowired
	IClienteService clienteservice;
	
	@PostMapping("/add")
	public int add(@RequestBody Cliente cliente) {
		clienteservice.add(cliente);
		return 0;
	}
	
	@GetMapping("/list_all")
	public List<Cliente> get_clientes()	{
		return clienteservice.list_all();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int cliente) {
		clienteservice.delete(cliente);
	}
	
	
	@GetMapping("/find_by_id/{cliente}")
	public Cliente find_by_id(@PathVariable("cliente") int cliente){
		return clienteservice.find_by_id(cliente);	
	}
	
	@PutMapping("/update")
	public int update(@RequestBody Cliente cliente) {
		clienteservice.modificar_cliente(cliente);
		return 0;
	}
}
