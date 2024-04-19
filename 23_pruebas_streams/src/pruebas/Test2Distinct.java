package pruebas;

import java.util.List;

public class Test2Distinct {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6,  8, 2, 98);
		System.out.println(nums.stream()
		.distinct()
		.count()
		);
	}

}
