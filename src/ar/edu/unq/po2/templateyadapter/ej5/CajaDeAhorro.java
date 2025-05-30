package ar.edu.unq.po2.templateyadapter.ej5;

public class CajaDeAhorro extends CuentaBancaria{
	
	private int limite;
	
	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}
	
	public int getLimite() {
		return this.limite;
	}

	@Override
	protected boolean puedeExtraer(int monto) {
		return (this.getSaldo() >= monto && this.getLimite() >= monto);	
	}
}