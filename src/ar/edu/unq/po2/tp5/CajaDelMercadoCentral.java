package ar.edu.unq.po2.tp5;

import java.util.List;

public class CajaDelMercadoCentral {
	
	private MercadoCentral mercadoCentral;
	private AgenciaRecaudadora agencia;
	private double montoTotal;
	
	public CajaDelMercadoCentral(MercadoCentral mercado, AgenciaRecaudadora agencia) {
		this.mercadoCentral = mercado;
		this.agencia = agencia;
	}
	
/*public String calcularTotal(Cliente cliente) {
		for(Producto p : cliente.getProductosAAdquirir()) {
			if(mercadoCentral.hayStock(p.getId())) {
				this.montoTotal += p.montoAPagar();
				mercadoCentral.decrementarStock(p.getId());
			} else {
				System.out.println("No hay stock del producto: " + p.getNombre());
			}
		}
		return "El monto total a pagar de los productos es de: " + this.montoTotal;
	}
*/	
	public String registrarCompra(List<Cobrable> cobrables) {
		this.montoTotal = 0.0;
		for(Cobrable c : cobrables) {
			c.registrarEnCaja(this);
		}
		return this.informarMontoTotal();
	}
	
	public void registrarProducto(Producto prod) {
		if(this.mercadoCentral.hayStock(prod.getId())) {
			this.sumarMonto(prod.montoAPagar());
			this.mercadoCentral.decrementarStock(prod.getId());
		}
	}
	
	public void sumarMonto(double monto) {
		this.montoTotal += monto;
	}
	
	public String informarMontoTotal() {
		return "El monto total de la compra es de: " + this.montoTotal;
	}
	
	public void notificar(Factura factura) {
		this.agencia.registrarPago(factura);
	}
}