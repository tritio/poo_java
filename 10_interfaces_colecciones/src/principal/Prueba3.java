package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		// realizar un método que recibe dos colecciones de enteros,
		// y devuelve un conjunto con los números contenidos en AMBAS colecciones
		
		ArrayList<Integer> numeros1 = new ArrayList<Integer>();
		numeros1.add(6);
		numeros1.add(7);
		numeros1.add(9);
		
		HashSet<Integer> numeros2 = new HashSet<Integer>();
		numeros2.add(10);
		numeros2.add(7);
		numeros2.add(34);
		numeros2.add(9);
		
		Set<Integer> coleccion = unirColecciones(numeros1, numeros2);
		
		System.out.println(coleccion);
		
		Iterator<Integer> it = coleccion.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

	public static Set<Integer> unirColecciones(Collection<Integer> c1, Collection<Integer> c2) {
		Set<Integer> conjunto = new HashSet<Integer>();
		
//		conjunto.addAll(c1); // Con este método agrega toda la colección al set
//		conjunto.addAll(c2);
		
		for(Integer n:c1) {
			if(c2.contains(n)) {
				conjunto.add(n);
			}
		}
		
		return conjunto;
		
	}
}
