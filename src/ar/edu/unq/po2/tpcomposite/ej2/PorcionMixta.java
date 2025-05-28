package ar.edu.unq.po2.tpcomposite.ej2;

import java.util.List;
import java.util.ArrayList;

public class PorcionMixta implements PorcionDeTierra {
	
	private List<PorcionDeTierra> porciones = new ArrayList<>();
	
	public PorcionMixta(List<PorcionDeTierra> porciones) {
		this.porciones = porciones;
	}
	
	public List<PorcionDeTierra> getPorciones() {
		return this.porciones;
	}
	
	public void agregarPorcion(PorcionDeTierra porcion) {
		porciones.add(porcion);
	}
	
	public void eliminarPorcion(PorcionDeTierra porcion) {
		porciones.remove(porcion);
	}

	@Override
	public double calcularGanancia() {
		double gananciaTotal = 0;
		for(PorcionDeTierra por : porciones) {
			gananciaTotal += por.calcularGanancia();
		}
		return gananciaTotal;
	}
}