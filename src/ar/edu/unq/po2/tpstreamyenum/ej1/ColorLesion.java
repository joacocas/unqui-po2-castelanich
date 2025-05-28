package ar.edu.unq.po2.tpstreamyenum.ej1;

public enum ColorLesion {
	
	ROJO("Rojo", "Alto", "GRIS"), GRIS("Gris", "Medio alto", "AMARILLO"), AMARILLO("Amarillo", "Medio bajo", "MIEL"), MIEL("Miel", "Bajo", "ROJO");
	
	private final String descripcion;
	private final String nivelDeRiesgo;
	private final String siguienteNombre;
	private ColorLesion siguienteColor;
	
	ColorLesion(String desc, String riesgo, String sigNombre) {
		this.descripcion = desc;
		this.nivelDeRiesgo = riesgo;
		this.siguienteNombre = sigNombre;
	}
	
	static {
		for(ColorLesion color : values()) {
			color.siguienteColor = ColorLesion.valueOf(color.siguienteNombre);
		}
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public ColorLesion getSiguienteColor() {
		return siguienteColor;
	}	
}