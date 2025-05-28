package ar.edu.unq.po2.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	
	private Banco banco;
	private Cliente cl1;
	private Cliente cl2;
	private Cliente cl3;
	private Propiedad p1;
	
	@BeforeEach
	void setUp() {
		
		cl1 = new Cliente("Joaquin", "Castelanich", 43851166, "Brown 422", 23, 15000.0);
		cl2 = new Cliente("Emilia", "Martinez", 43851789, "Brown 422", 23, 8000.0);
		cl3 = new Cliente("Andres", "Castelanich", 25657063, "Brown 422", 67, 2000.0);
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(cl1);
		clientes.add(cl2);
		clientes.add(cl3);
		
		banco = new Banco(clientes);
		
		p1 = new Propiedad("linda", "lavalle 288", 87324.0);
	}
	
	@Test
	void testDesembolsoDeDineroParaCLiente1() {
		double montoADesembolsarEsperado = 39000.0;
		
		cl1.realizarSolicitudDeCreditoPersonalA(banco, 9000.0, 10);
		cl1.realizarSolicitudDeCreditoHipotecario(banco, 30000.0, 20, p1);
		
		assertEquals(montoADesembolsarEsperado, banco.desembolsarDineroDeSolicitudesDe(cl1));
	}
	
	@Test
	void testDesembolsoDeDineroDeTodoElBanco() {
		double montoADesembolsarEsperado = 44500.0;
		
		cl1.realizarSolicitudDeCreditoPersonalA(banco, 9000.0, 10);
		cl1.realizarSolicitudDeCreditoHipotecario(banco, 30000.0, 20, p1);
		cl2.realizarSolicitudDeCreditoPersonalA(banco, 5500.0, 10);
		cl3.realizarSolicitudDeCreditoHipotecario(banco, 20000.0, 20, p1);
		
		assertEquals(montoADesembolsarEsperado, banco.montoTotalDeDineroADesembolsar());
	}

}
