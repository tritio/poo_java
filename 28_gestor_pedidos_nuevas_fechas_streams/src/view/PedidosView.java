package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.Pedido;
import service.PedidoService;

public class PedidosView {

	static PedidoService service = new PedidoService();
	
	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("Seleccione opción: ");			
			presentarMenu();
			try {
			opcion = Integer.parseInt(sc.nextLine());		
			
				switch (opcion) {
				case 1:
					agregarPedido();
					break;
				case 2:
					buscarMasReciente();
					break;
				case 3:
					buscarDosFechas();
					break;	
				case 4: 
					PedidoProximoFecha();
				case 5:
					System.out.println("hasta luego");
					break;
				default: 
					System.out.println("opción no válida");
				}
			} catch(NumberFormatException ex){
				System.out.println("Debe introducir un número ");	
			}			
			
		}while(opcion!=5);
		
		

	}
	
	static void presentarMenu() {
		System.out.println("""
				
				1.- Agregar pedido
				2.- Pedido más reciente
				3.- Pedidos entre dos fechas
				4.- Pedidos próximos a fechas			
				5.- Salir
				""");
	
	}
	
	static void agregarPedido()  {		
		Scanner sc = new Scanner(System.in);		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/MM/yyyy");	
			System.out.println("Introduce producto: ");
			String producto = sc.nextLine();
			System.out.println("Introduce unidades de producto: ");
			int unidades = Integer.parseInt(sc.nextLine());
		    System.out.println("Introduce fecha del pedido: (dd/MM/yyyy) ");
			String fecha = sc.nextLine();				
			LocalDate date=LocalDate.parse(fecha, format);		
			Pedido pedido = new Pedido(producto, unidades, date);	
			service.nuevoPedido(pedido);	
		
	}
	
	static void buscarMasReciente() {
		Pedido p = service.pedidoMasReciente();
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("El pedido más reciente es: " +
				p.getProducto() +
				" fecha pedido: " + p.getFechaPedido().format(sdf) + 
				" unidades " + p.getUnidades());		
	}
	
	static void buscarDosFechas() throws ParseException {
		Scanner sc = new Scanner(System.in);			
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduce las fecha inicial: (dd/MM/yyyy) ");
		String fecha1 = sc.nextLine();		
		LocalDate date1=LocalDate.parse(fecha1, sdf);
		
		System.out.println("Introduce las fecha final: (dd/MM/yyyy) ");
		String fecha2 = sc.nextLine();			
		LocalDate date2=LocalDate.parse(fecha2, sdf);
		
		ArrayList<Pedido> resultados = service.pedidosEntreFecha(date1, date2);
		
		for(Pedido p: resultados) {
			System.out.println(" Producto: " + p.getProducto() + " Unidades: " + p.getUnidades() + 
					" Fecha pedido: " + p.getFechaPedido().format(sdf));
		}
		
	}
	
	static void PedidoProximoFecha() {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Introduce las fecha a buscar: (dd/MM/yyyy) ");
		String fecha = sc.nextLine();	
		LocalDate date=LocalDate.parse(fecha, sdf);
		System.out.println("el producto más próximo a la fecha: " + fecha +  " es: " + 
		service.pedidoProximoFecha(date).getProducto());
		
		
	}

}
