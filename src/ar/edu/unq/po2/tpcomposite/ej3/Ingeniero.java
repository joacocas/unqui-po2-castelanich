package ar.edu.unq.po2.tpcomposite.ej3;

import java.util.List;
import java.util.ArrayList;

public class Ingeniero implements ICharacter {
	
	private List<Laja> bolsaDeLajas = new ArrayList<>();
	private String nombre;
	private Punto posicion;
	
	public Ingeniero(List<Laja> bolsa, String nom, Punto pos) {
		this.bolsaDeLajas = bolsa;
		this.nombre = nom;
		this.posicion = pos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Laja> getBolsaDeLajas() {
		return this.bolsaDeLajas;
	}
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	public boolean quedanLajas() {
		return this.bolsaDeLajas.size() != 0;
	}
	
	public void dejarLaja() {
		if(!quedanLajas()) {
			System.out.println("No hay mas lajas para dejar");
		}
		this.bolsaDeLajas.remove(0);
	}
	
	@Override
	public void caminar(Punto destino) {
		if(!posicion.estaLibre()) {
			dejarLaja();
		}
		this.posicion = destino;
	}
}
