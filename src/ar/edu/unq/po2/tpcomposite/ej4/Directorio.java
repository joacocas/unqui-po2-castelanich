package ar.edu.unq.po2.tpcomposite.ej4;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Directorio implements FyleSystem{
	
	private String nombre;
	private LocalDateTime fechaCreacion;
	private LocalDateTime ultimaModificacion;
	private List<FyleSystem> contenido;
	
	public Directorio(String nom, LocalDateTime date) {
		this.nombre = nom;
		this.fechaCreacion = date;
		this.ultimaModificacion = date;
		this.contenido = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public LocalDateTime getFechaUltimaModificacion() {
		return this.ultimaModificacion;
	}
	
	public List<FyleSystem> getContenido() {
		return this.contenido;
	}
	
	public void agregarElemento(FyleSystem elemento) {
		this.contenido.add(elemento);
		this.ultimaModificacion = LocalDateTime.now();
	}
	
	@Override
	public int totalSize() {
		int total = 0;
		for(FyleSystem file : contenido) {
			total += file.totalSize();
		}
		return total;
	}
	
	@Override
	public void printStructure(String identacion) {
		System.out.println(identacion + "+	" + this.nombre + " (Directorio)");
		String nuevaIdentacion = identacion = "	";
		for(FyleSystem file : contenido) {
			file.printStructure(nuevaIdentacion);
		}
	}
	
	public FyleSystem lastModified() {
		if (contenido.isEmpty()) {
	        return this;
	    }
	    return contenido.stream().reduce((masReciente, elementoActual) -> {
	        LocalDateTime fechaMasReciente;
	        LocalDateTime fechaActual;

	        if (masReciente instanceof Archivo) {
	        	fechaMasReciente = ((Archivo) masReciente).getFechaUltModificacion();
	        } else {
	            fechaMasReciente = ((Directorio) masReciente).ultimaModificacion;
	        }

	        if (elementoActual instanceof Archivo) {
	        	fechaActual = ((Archivo) elementoActual).getFechaUltModificacion();
	        } else {
	            fechaActual = ((Directorio) elementoActual).ultimaModificacion;
	        }

	        return fechaActual.isAfter(fechaMasReciente) ? elementoActual : masReciente;
	     })
	     .orElse(this);
	}
	
	public FyleSystem oldestElement() {
		if (contenido.isEmpty()) {
	        return this;
	    }
	    return contenido.stream().reduce((masAntiguo, elementoActual) -> {
	        LocalDateTime fechaMasAntigua;
	        LocalDateTime fechaActual;

	        if (masAntiguo instanceof Archivo) {
	        	fechaMasAntigua = ((Archivo) masAntiguo).getFechaCreacion();
	        } else {
	            fechaMasAntigua = ((Directorio) masAntiguo).fechaCreacion;
	        }

	        if (elementoActual instanceof Archivo) {
	        	fechaActual = ((Archivo) elementoActual).getFechaCreacion();
	        } else {
	            fechaActual = ((Directorio) elementoActual).fechaCreacion;
	        }

	        return fechaActual.isBefore(fechaMasAntigua) ? elementoActual : masAntiguo;
	     })
	     .orElse(this);
	}
}