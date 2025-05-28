package ar.edu.unq.po2.tp6.banco;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	
	private List<Cliente> clientes = new ArrayList<>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<>();
	
	public Banco(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public List<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public void agregarSolicitud(SolicitudDeCredito sol) {
		this.getSolicitudes().add(sol);
	}
	
	public void registrarSolicitudDeCreditoPersonal(Cliente cl, double monto, int plazo) {
		SolicitudPersonal sol = new SolicitudPersonal(cl, monto, plazo);
		this.agregarSolicitud(sol);
	}
	
	public void registrarSolicitudDeCreditoHipotecario(Cliente cl, double monto, int plazo, Propiedad garantia) {
		SolicitudHipotecaria sol = new SolicitudHipotecaria(cl, monto, plazo, garantia);
		this.agregarSolicitud(sol);
	}
	
	public double desembolsarDineroDeSolicitudesDe(Cliente cl) {
		double total = 0;
		for(SolicitudDeCredito sol : solicitudes) {
			if(sol.getDniCliente() == (cl.getDni()) && sol.esAceptable()) {
				total += sol.getMontoSolicitado();
			}
		}
		return total;
	}
	
	public double montoTotalDeDineroADesembolsar() {
		double total = 0;
		for(SolicitudDeCredito sol : solicitudes) {
			if(sol.esAceptable()) {
				total += sol.getMontoSolicitado();
			}
		}
		return total;
	}
}