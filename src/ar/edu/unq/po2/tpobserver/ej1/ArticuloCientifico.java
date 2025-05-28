package ar.edu.unq.po2.tpobserver.ej1;

import java.util.List;

public class ArticuloCientifico {
	
	private String titulo;
	private List<String> autores;
	private String filiacion;
	private String tipo;
	private String lugarPublicacion;
	private List<String> palabrasClaves;
	
	public ArticuloCientifico(String tit, List<String> aut, String fil, String tip, String lu, List<String> pal) {
		this.titulo = tit;
		this.setAutores(aut);
		this.setFiliacion(fil);
		this.setTipo(tip);
		this.setLugarPublicacion(lu);
		this.setPalabrasClaves(pal);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public void setFiliacion(String filiacion) {
		this.filiacion = filiacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLugarPublicacion() {
		return lugarPublicacion;
	}

	public void setLugarPublicacion(String lugarPublicacion) {
		this.lugarPublicacion = lugarPublicacion;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(List<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}
}
