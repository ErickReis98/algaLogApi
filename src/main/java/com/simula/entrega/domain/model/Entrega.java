package com.simula.entrega.domain.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Entrega {

	private Long id;
	private Cliente cliente;
	private Destinatario destinatario;
	private BigDecimal taxa;
	private StatusEntrega status;
	private LocalDateTime dataPedido;
	private LocalDateTime dataFinalizacao;
}
