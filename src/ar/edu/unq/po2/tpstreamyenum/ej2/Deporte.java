package ar.edu.unq.po2.tpstreamyenum.ej2;

public enum Deporte {
	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(5), JABALINA(4);
	
	private final int complejidad;
	
	Deporte(int complejidad) {
		this.complejidad = complejidad;
	}
	
	public int getComplejidad() {
		return this.complejidad;
	}
}
