package ar.edu.unq.po2.tpcomposite.ej4;

import java.time.LocalDateTime;

public class Archivo implements FyleSystem{
	
	private String nombre;
	private long espacioOcupado;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Archivo(String nom, long cap, LocalDateTime date1) {
		this.nombre = nom;
		this.espacioOcupado = cap;
		this.fechaCreacion = date1;
		this.fechaUltimaModificacion = date1;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}
		
	public LocalDateTime getFechaUltModificacion() {
		return this.fechaUltimaModificacion;
	}
	
	@Override
	public int totalSize() {
		return (int) this.espacioOcupado;
	}
	
	@Override
	public void printStructure(String identacion) {
		System.out.println(identacion + "-	" + this.nombre + " (Archivo)");
	}
	
	@Override
	public FyleSystem lastModified() {
		return this;
	}
	
	@Override
	public FyleSystem oldestElement() {
		return this;
	}
}
