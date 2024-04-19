package principal;

import java.util.List;

public class Test5Filter {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6,  4, 2, 98);
		// ¿cuántos números positivos no repetidos existen?
		System.out.println(nums.stream()
			.filter(n-> n > 0)
			.distinct()
			.count()
		);

	}

}
