package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarDecimales {

	public static void main(String[] args) {
		List<Double> nums = new ArrayList<>(List.of(12.5,5.3,9.6, 2.0, 17.8, 4.2));
		
		// tres formas distintas de comparar double:
		
		nums.sort((a,b)-> a>b? 1: -1);
		nums.forEach(n->System.out.println(n));
		nums.sort((a,b)-> Double.compare(a,  b)); // método estático de la clase Double
		nums.forEach(n->System.out.println(n));
		nums.sort((a,b)-> a.compareTo(b)); // método de la clase Double
		nums.forEach(n->System.out.println(n));
	}

}
