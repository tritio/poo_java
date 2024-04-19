package pruebas;

import java.util.List;

public class Test3Limit {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6, 98);
		// imprime los cinco primeros números sin incluir repetidos
		nums.stream()
				.distinct()
				.limit(5)
				.forEach(n->System.out.println(n));		
	}

}
