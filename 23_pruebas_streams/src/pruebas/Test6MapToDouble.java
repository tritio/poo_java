package pruebas;

import java.util.List;

public class Test6MapToDouble {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6, 98);
		// suma de todos los números negativos
				
	System.out.println(nums.stream()
			.filter(n-> n < 0) // Stream<Integer>
			.mapToInt(n-> n)
			.sum());

		// media de todos los números positivos, sin duplicados
		
		nums.stream()
			.filter(n-> n > 0) // Stream<Integer>
			.distinct()
			.mapToInt(n-> n)		
			.average() // OptionalDouble
			.ifPresentOrElse(n->System.out.println(n), ()->System.out.println("no hay media"));
		
	}

}
