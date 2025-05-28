package ar.edu.unq.po2.tpobserver.ej1;

import java.util.List;
import java.util.ArrayList;

public class ManejadorDeEventos {
	
	private List<Observer> observadores;
	
	public ManejadorDeEventos() {
		this.observadores = new ArrayList<>();
	}
	
	public List<Observer> getObservers() {
		return observadores;
	}
	
	public void subscribir(Observer o) {
		getObservers().add(o);
	}
	
	public void desuscribir(Observer o) {
		getObservers().remove(o);
	}
	
	public void enviarUltimasActualizacionesA(List<ArticuloCientifico> articulos) {
		for(Observer o : observadores) {
			o.notificar(articulos);
		}
	}
}
