package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Punto puntoInicial;
	private Punto puntoFinal;
	
	public Punto getPuntoInicial() {
	    return puntoInicial;
	}

	public Punto getPuntoFinal() {
	    return puntoFinal;
    }
	
	public int getAncho() {
        return (puntoFinal.getPuntoX() - puntoInicial.getPuntoX());
    }

    public int getAlto() {
        return (puntoFinal.getPuntoY() - puntoInicial.getPuntoY());
    }
	
    public Rectangulo(Punto p1, Punto p2) {
        this.puntoInicial = new Punto(Math.min(p1.getPuntoX(), p2.getPuntoX()), Math.min(p1.getPuntoY(), p2.getPuntoY()));
        this.puntoFinal = new Punto(Math.max(p1.getPuntoX(), p2.getPuntoX()), Math.max(p1.getPuntoY(), p2.getPuntoY()));
    }

	public int calcularArea() {
		return (getAlto() * getAncho());
	}
	
	public int calcularPerimetro() {
		return 2 * (getAlto() + getAncho());
	}
	
	public boolean esHorizontal() {
	    return getAlto() == 0;
	}

	public boolean esVertical() {
	    return getAncho() == 0;
	}
	
}
