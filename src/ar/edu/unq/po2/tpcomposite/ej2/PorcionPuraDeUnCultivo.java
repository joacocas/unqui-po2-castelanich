package ar.edu.unq.po2.tpcomposite.ej2;

public class PorcionPuraDeUnCultivo implements PorcionDeTierra {
	
	private Cultivo cultivo;
	
	public PorcionPuraDeUnCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	public Cultivo getCultivo() {
		return this.cultivo;
	}

	@Override
	public double calcularGanancia() {
		return this.cultivo.getValorAnual();
	}
}
