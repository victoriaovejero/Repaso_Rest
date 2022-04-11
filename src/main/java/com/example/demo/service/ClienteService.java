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
	public void addCliente(Cliente cliente) {
		clienterepository.save(cliente);
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listAll() {
		
		// TODO Auto-generated method stub
		return (List<Cliente>) clienterepository.findAll();
	}

	@Override
	public Cliente findCliente(int id) {
		// TODO Auto-generated method stub
		return clienterepository.findById(id).orElse(null);
	}

	@Override
	public void modifyCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienterepository.save(cliente);

	}

	@Override
	public void deleteCliente(int id) {
		// TODO Auto-generated method stub
		clienterepository.deleteById(id);
	}

}
