package pruebas;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6, 98);
		System.out.println(nums.stream().count());
		nums.stream()
		.forEach(System.out::println );  // usando la expresión con:: llamada referencia a método (ver pdf)
		// o también:
		// .forEach(n->System.out.println(n));	
	}

}
