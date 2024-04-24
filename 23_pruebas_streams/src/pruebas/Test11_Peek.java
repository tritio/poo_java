package pruebas;

import java.util.List;

public class Test11_Peek {

	public static void main(String[] args) {
		List<Integer> nums = List.of(11, 4, 5, 8, 2, 7, 5, 8);
		// muestra cada número de la lista, sin contar repetidos, y después el total de números existentes
		
		System.out.println(
				"Total de números: " + 
						nums.stream()
						.distinct()
						.peek(n-> System.out.println(n)) // Stream<Integer>							
						.count());

	}

}
