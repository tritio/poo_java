package pruebas;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenarEnteros {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(12,5,9, 2, 17, 4));
		// ordenar de menos a más
		nums.sort((a,b)-> a-b);  // criterio si el resultado es negativo es que el primero es menor que el segundo
		nums.forEach(n->System.out.println(n));
		// ordenar de más a menos. Le doy el criterio al revés
		nums.sort((a,b)-> b-a);
		nums.forEach(n->System.out.println(n));
	}

}
