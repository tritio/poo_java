package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OperacionesService  {

	// principio de responsabilidad única:
	public int sumarPorCondicion(List<Integer> numeros, Condicion condicion) { // recibe una lista y una clase que cumple la interfaz Condicion
		int suma = 0;		
		for(int n: numeros) {
			if(condicion.test(n)) {
				suma += n;				
			}
		}	
		return suma;
	}	
	
	// método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos 
	
	public void procesarPorCondicion(Collection<Integer> numeros, Consumer<Integer> operacion, Predicate<Integer> condicion) {
		for(Integer n: numeros) {
			if(condicion.test(n)) {
				operacion.accept(n);
			}
		}
	}
	
	//método que recibe una lista y devuelve la suma de todos los elementos de la lista, añadiendo el valor 
	//que se extraiga de un fichero
	//método que recibe una lista y devuelve la suma de todos los elementos de la lista, a le añadimos un número 
	//léido desde un puerto externo 
	
	public int sumaConExtra(List<Integer> numeros, Supplier<Integer> sup) {
		int suma = 0;
		for (Integer n: numeros) {
			suma+=n;
		}
		suma += sup.get();
		return suma;
	}
	
}

