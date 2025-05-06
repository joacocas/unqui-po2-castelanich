package ar.edu.unq.po2.tp5;

public abstract class Producto implements Cobrable{
	
	protected int id;
	protected String nombre;
	protected double precio;
	
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double montoAPagar() {
		return this.precio;
	}
	
	public void registrarEnCaja(CajaDelMercadoCentral caja) {
		caja.registrarProducto(this);
	}
}