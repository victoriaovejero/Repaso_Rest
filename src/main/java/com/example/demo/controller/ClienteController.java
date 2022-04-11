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
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	IClienteService clienteservice;
	
	@PostMapping("/add")
	public Integer anadirCliente(@RequestBody Cliente cliente) {
		Cliente clienteaux = clienteservice.findCliente(cliente.getId());
		if (clienteaux == null) {
			clienteservice.addCliente(cliente);
			return 1;
		} else {
			return 0;
		}
	}
	
	@GetMapping("/list_all")
	public List<Cliente> listClientes()	{
		return clienteservice.listAll();
	}
	
	@GetMapping("/find_cliente/{id}")
	public Cliente getCliente(@PathVariable("id") Integer id){
		Cliente clienteaux = clienteservice.findCliente(id);
		if (clienteaux == null) {
			return new Cliente();
		}else {
			return clienteaux;	
		}
	}
	
	@PutMapping("/update_client")
	public Integer modificarCliente(@RequestBody Cliente cliente) {
		Cliente clienteaux = clienteservice.findCliente(cliente.getId());
		if (clienteaux == null) {
			return 0;
		} else {
			clienteservice.modifyCliente(clienteaux);
			return 1;
		}
	}
	@DeleteMapping("/delete/{id}")
	public Integer delete(@PathVariable("id") Integer id) {
		Cliente clienteaux =clienteservice.findCliente(id);
		if (clienteaux ==null) {
			return 0;
		} else {
			clienteservice.deleteCliente(id);
			return 1;
		}
	}
}
