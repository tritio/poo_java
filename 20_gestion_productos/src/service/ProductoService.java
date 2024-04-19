package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoService {

	/*
	 * Programa para gestión de productos.
	 * 
	 * Cada producto tendrá: nombre, precio, categoria
	 * 
	 * La lógica de negocio, expondrá los siguientes métodos:
	 * 
	 * -eliminarPorCategoria: elimina de la lista aquellos productos que pertenezcan
	 * a la categoría indicada
	 * 
	 * -bajarPrecio: Baja el precio de todos productos en el porcentaje indicado
	 * 
	 * -subirPrecioCategoria: Sube el precio a todos los productos de la categoría
	 * indicada, en el porcentaje indicado
	 * 
	 * -obtenerProductos: Devuelve la lista de productos existentes
	 * -agregarProducto: Añade el producto recibido
	 */
	
	List<Producto> productos = new ArrayList<Producto>();
	
	public void eliminarPorCategoria(String categoria) {
		
		productos.removeIf(n -> n.getCategoria().equals(categoria));
	}
	
	public void bajarPrecio(int porcentaje) {
		
		productos.forEach(n -> n.setPrecio(n.getPrecio()*(100 - porcentaje)/100));
		
	}
	
	public void subirPrecioCategoria(int porcentaje, String categoria) {
	//	productos.forEach(n -> n.setPrecio(n.getPrecio()*(100 + porcentaje)/100));  // falta condición de categoría
		// otra forma utilizando replaceAll
		productos.replaceAll(p -> {
			if(categoria.equals(p.getCategoria())) {
				p.setPrecio(p.getPrecio()*((100 + porcentaje)/100));			
			}
			return p;
		});
	}
	
	public List<Producto> obtenerProductos() {
		
		return productos;
				
	}
	
	public void agregarProducto(Producto pro) {
		productos.add(pro);
	}
	
	public void ordenarPorPrecio() {
		productos.sort((a,b)-> Double.compare(a.getPrecio(), b.getPrecio()));
	}
}
