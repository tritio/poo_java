package principal;

import java.util.ArrayList;
import java.util.List;

public class Prueba5 {

	public static void main(String[] args) {
		List<Integer> lst1 = new ArrayList<Integer>();
		
	//	List<Number> lst2 = new ArrayList<Integer>();  // no se puede, aunque Integer herede de Number. No se puede hacer colecciones de objetos distintos
		
		List<Number> lst3 = new ArrayList<Number>();
		lst3.add(10);
		lst3.add(4.5);
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		nums.add(25);
		nums.add(3);
		nums.add(45);
		
		// List<Number> lst4 = nums; // no se puede
		
		List<?> lst4 = nums;  // la ? es un comodín.
		List<? extends Number> lst5 = nums; // adminte una lista de cualquier tipo que herede number
		List<? super Integer> lst6 = nums; // admite lista de cualquier tipo que sea superclase de integer o propio integer
		
	}
	/*
	 * Escribe un método que nos muestre la parte entera de cualquier objeto
	 * numérico de envoltorio:
	 * 
	 * Double d=2.3; 
	 * Integer integ=7; 
	 * Float ft=3.4f;
	 * 
	 * metodo(d) -> 2 
	 * metodo(integ) ->7 
	 * metodo(ft) -> 3
	 * 
	 * public int partEntera(Number numero) {
	 * 
	 * return numero.intValue();
	 * 	 * 
	 * }
	 */
}
