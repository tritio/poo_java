package pruebas;

import java.util.List;

public class Test7Reduce {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6, 98);
		
		System.out.println(
				nums.stream()
				.filter(n-> n < 0)
				.reduce((a,b)->a+b)
				.orElse(0)	
			);

	}

}
