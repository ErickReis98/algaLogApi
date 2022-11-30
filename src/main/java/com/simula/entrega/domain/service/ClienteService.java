package com.simula.entrega.domain.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.simula.entrega.domain.model.Cliente;
import com.simula.entrega.domain.repository.ClienteRepository;

@Service
public class ClienteService {

	private ClienteRepository cRepository;

	public ClienteService(ClienteRepository cRepository) {
		super();
		this.cRepository = cRepository;
	}

	@Transactional
	public Cliente salvar(Cliente cliente) {
		return cRepository.save(cliente);
	}

	@Transactional
	public void excluir(Long clienteId) {
		cRepository.deleteById(clienteId);
	}
	
	@Transactional
	public Cliente alterar(Long id, Cliente cliente) {
		cliente.setId(id);
		return cliente = cRepository.save(cliente);
	}

	@Transactional
	public List<Cliente> listarTodos() {
		return cRepository.findAll();
	}
	
	
}
