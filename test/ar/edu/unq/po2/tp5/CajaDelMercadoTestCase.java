package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class CajaDelMercadoTestCase {
	
	private AgenciaRecaudadora agencia;
	private MercadoCentral mercado;
	private CajaDelMercadoCentral cajamc;
	private Producto arroz;
	private Producto pescado;
	private Producto carne;
	private Cliente cliente1;
	private Factura impuesto;
    private Factura servicio;
	
    @BeforeEach
    public void setUp() {
    	
    	agencia = new AgenciaRecaudadora();
    	mercado = new MercadoCentral();
    	cajamc = new CajaDelMercadoCentral(mercado, agencia);
    	
    	arroz = new ProductoDeCooperativa(23, "Arroz", 2000.0);
		pescado = new ProductoDeEmpresaTradicional(10, "Pescado", 3600.50);
		carne = new ProductoDeCooperativa(5, "Carne", 3000.10);
		
		mercado.agregarProductoAlStock(arroz, 3);
		mercado.agregarProductoAlStock(carne, 2);
		mercado.agregarProductoAlStock(pescado, 0);
		
		cliente1 = new Cliente("simon");
    	
		cliente1.agregarCobrable(carne);
		cliente1.agregarCobrable(pescado);
		cliente1.agregarCobrable(arroz);
		
		impuesto = new Impuesto(20.0);
		servicio = new Servicio(13.2, 2);
    }
    
	@Test
	void testGastoTotalDelCliente1() {
		double totalEsperado = 4500.09;
		
		int carneRestante = 1;
		int pescadoRestante = 0;
		int arrozRestante = 2;
		
		assertEquals("El monto total de la compra es de: " + totalEsperado, cajamc.registrarCompra(cliente1.getProductosCobrables()));
		
		assertEquals(carneRestante, mercado.stockDe(carne.getId()));
		assertEquals(pescadoRestante, mercado.stockDe(pescado.getId()));
		assertEquals(arrozRestante, mercado.stockDe(arroz.getId()));
	}
	
	@Test
    public void testImpuesto() {
        List<Cobrable> impuestos = List.of(impuesto);
        assertEquals("El monto total de la compra es de: 20.0", cajamc.registrarCompra(impuestos));
    }
    
    @Test
    public void testServicio() {
        List<Cobrable> servicios = List.of(servicio);
        assertEquals("El monto total de la compra es de: 26.4", cajamc.registrarCompra(servicios));
    }
    
    @Test
    public void testFacturas() {
        List<Cobrable> facturas = List.of(servicio, impuesto);
        assertEquals("El monto total de la compra es de: 46.4", cajamc.registrarCompra(facturas));
    }
    
    @Test
    public void testCobrables() {
        List<Cobrable> cobrables = List.of(servicio, impuesto, arroz, pescado);
        assertEquals("El monto total de la compra es de: 1846.4", cajamc.registrarCompra(cobrables));
    }
}