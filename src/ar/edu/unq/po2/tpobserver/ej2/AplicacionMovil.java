package ar.edu.unq.po2.tpobserver.ej2;

import java.util.List;

public class AplicacionMovil implements Observer{
	
	private List<String> deportesDeInteres;
	
	public AplicacionMovil(List<String> deps) {
		this.deportesDeInteres = deps;
	}
	
	public List<String> getDeportesDeInteres() {
		return deportesDeInteres;
	}
	
	@Override
	public void informacionDe(List<Partido> partidos) {
		for(Partido p : partidos) {
			String deporte = p.getDeporte();
			if(deportesDeInteres.contains(deporte)) {
				System.out.println("El resultado del partido es: " + p.getResultado());
			}
		}	
	}
}
