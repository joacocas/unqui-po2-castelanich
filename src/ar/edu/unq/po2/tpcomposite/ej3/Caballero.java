package ar.edu.unq.po2.tpcomposite.ej3;

public class Caballero implements ICharacter {
	
	private String nombre;
	private Punto posicion;
	
	public Caballero(String nom, Punto pos) {
		this.nombre = nom;
		this.posicion = pos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	@Override
	public void caminar(Punto destino) {
		this.posicion = destino;
	}
}