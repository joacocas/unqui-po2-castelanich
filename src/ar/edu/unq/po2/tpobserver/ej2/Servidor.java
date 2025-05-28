package ar.edu.unq.po2.tpobserver.ej2;

import java.util.List;

public class Servidor implements Observer{
	
	public List<String> deportesSuscritos;
	
	public Servidor(List<String> depsub) {
		this.deportesSuscritos = depsub;
	}
	
	@Override
	public void informacionDe(List<Partido> partidos) {
		for(Partido p : partidos) {
			String deporte = p.getDeporte();
			if(deportesSuscritos.contains(deporte)) {
				System.out.println("Servidor recibio la informacion del partido");
			}
		}
	}

}
