package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
 
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Erick");
		c1.setEmail("erickrr98@gmail.com");
		c1.setTelefone("11965869482");
		
		var c2 = new Cliente();
		c2.setId(2L);
		c2.setNome("Sarah");
		c2.setEmail("sarahlima97@hotmail.com");
		c2.setTelefone("11999385411");
		
		
		
		return  Arrays.asList(c1, c2);
	}
}
