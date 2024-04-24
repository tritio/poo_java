package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Calendar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Pedido;
import service.PedidoService;

class TestPedidoService {
	
	static PedidoService service = new PedidoService();
	static Calendar calendar = Calendar.getInstance();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		LocalDate f1 = LocalDate.of(2023,11,30);
		LocalDate f2 = LocalDate.of(2022,10,01);
		LocalDate f3 = LocalDate.of(2022,04,11);
		
		
		service.nuevoPedido(new Pedido("coca-cola",20, f1));
		service.nuevoPedido(new Pedido("whisky",1, f2));
		service.nuevoPedido(new Pedido("patatas fritas",10, f3));
	}

	@Test
	void testPedidoMasReciente() {		
		assertTrue(service.pedidoMasReciente().isPresent());
		assertEquals("coca-cola", service.pedidoMasReciente().get().getProducto()); // get() porque es un Optional y envuelve todo
	}

	@Test
	void testPedidosEntreFecha() {
		
		LocalDate fmin = LocalDate.of(2022,1,1);
		LocalDate fmax = LocalDate.of(2022,12,31);		
		
		assertEquals(2, service.pedidosEntreFecha(fmin, fmax).size());		
	}
	@Test
	void testPedidosProximoFecha() {
		assertEquals("coca-cola", service.pedidoProximoFecha(LocalDate.of(2023, 12, 7)).getProducto());
		assertEquals("patatas fritas", service.pedidoProximoFecha(LocalDate.of(2022, 04, 7)).getProducto());
	}
	

}
