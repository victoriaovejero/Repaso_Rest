package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IClienteService;
import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;


@Service
public class ClienteService implements IClienteService {
	
	@Autowired
	ClienteRepository clienterepository;//el segundo puede llevar el nombre que quieras

	@Override
	public void add(Cliente cliente) {
		clienterepository.save(cliente);
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> list_all() {
		
		// TODO Auto-generated method stub
		return (List<Cliente>) clienterepository.findAll();
	}

	@Override
	public Cliente find_by_id(int id) {
		// TODO Auto-generated method stub
		return clienterepository.findById(id).orElse(null);
	}

	@Override
	public void modificar_cliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienterepository.save(cliente);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		clienterepository.deleteById(id);
	}

}
