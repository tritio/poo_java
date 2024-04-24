package service;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidoService {
	
		HashSet<Pedido> pedidos = new HashSet<Pedido>();
		
		public void nuevoPedido(Pedido pedido) {			
				pedidos.add(pedido);					
			}
		
		// devuelve el pedido más reciente, pero si hay más de uno el que tenga más unidades
		public Optional<Pedido> pedidoMasReciente() {		
			return pedidos.stream()
				//.max((a,b)-> a.getFechaPedido().compareTo(b.getFechaPedido()));
				 // si no pongo orElse o similar entonces devuelve un optional
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
				.thenComparingInt(p->p.getUnidades()));
			
		}
		public List<Pedido> pedidosEntreFecha(LocalDate f1, LocalDate f2) {
			return pedidos.stream()
					.filter(p -> p.getFechaPedido().compareTo(f1)  >= 0 &&
							  p.getFechaPedido().compareTo(f2) <= 0)
					.collect(Collectors.toList());
			
		}
		
		public Pedido pedidoProximoFecha(LocalDate fecha) {				
				return pedidos.stream()
					.min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))))
					.orElse(null);
		}

     // devuelve la lista de pedidos del producto recibido como parámetro
		public List<Pedido> pedidosPorProducto(String producto) {
			return pedidos.stream()
					.filter(p-> p.getProducto().equalsIgnoreCase(producto))
					//.collect(Collectors.toList());
					.toList(); // hace lo mismo que la línea de arriba
		}
		
	// devuelve el pedido con menor número de unidades, si hay más de uno, el primero que encuentra
		public Optional<Pedido> pedidoMenor() {
			return pedidos.stream()
					.min(Comparator.comparingInt(p-> p.getUnidades()));
		}	
		
		// devuelve una cadena con los nombres de todos los productos, sin duplicar, separados por un guion 
		
		public String nombreProductos() {
			return pedidos.stream()  // Stream <Pedido> , hay que convertirlo en un stream de cadena de caracteres
				.map(p->p.getProducto()) // Stream <String>
				.distinct()
				.collect(Collectors.joining("-"));
		}
}
		
		

	

	

