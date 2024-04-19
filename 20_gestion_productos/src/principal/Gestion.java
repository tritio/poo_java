package principal;

import model.Producto;
import service.ProductoService;

public class Gestion {

	public static void main(String[] args) {

		ProductoService service = new ProductoService();
		
		service.agregarProducto(new Producto("pan", 30, "comida"));
		service.agregarProducto(new Producto("leche", 70, "comida"));
		service.agregarProducto(new Producto("pan", 30, "comida"));
		service.agregarProducto(new Producto("boli", 40, "papeleria"));
		service.agregarProducto(new Producto("folios", 20, "papeleria"));
		service.agregarProducto(new Producto("estuche", 130, "papeleria"));		
		System.out.println(service.obtenerProductos());
		
		service.bajarPrecio(20);
		System.out.println(service.obtenerProductos());
		
		service.subirPrecioCategoria(5, "papeleria");
		System.out.println(service.obtenerProductos());
		
		service.eliminarPorCategoria("comida");
		System.out.println(service.obtenerProductos().toString());		
		
	}

}
