package ar.edu.unq.po2.tpobserver.ej2;

import java.util.List;

public class ManejadorDeEventos {
	
	private List<Partido> partidos;
	private List<Observer> observadores;
	
	public ManejadorDeEventos(List<Partido> partidos, List<Observer> obs) {
		this.partidos = partidos;
		this.observadores = obs;
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public List<Observer> getObservers() {
		return observadores;
	}
	
	public void suscribirObserver(Observer o) {
		getObservers().add(o);
	}
	
	public void desuscribirObserver(Observer o) {
		getObservers().remove(o);
	}
	
	public void recibirInformacion(Partido par) {
		getPartidos().add(par);
	}
	
	public void enviarInformacionAlServidor() {
		for(Observer o : observadores) {
			o.informacionDe(getPartidos());
		}
	}
}