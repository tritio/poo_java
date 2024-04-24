package pruebas;

import java.util.List;

public class Test12Peek {

	public static void main(String[] args) {
		List<Integer> nums = List.of(11, 4, -5, 8, -2, 7, 5, 8);
		
		System.out.println(
				nums.stream()
				.peek(n->System.out.println(n)) // todos los métodos intermedios funcionan en modo lazy
				.anyMatch(n->n < 0)  // modo cortocircuito en cuanto encuentra un match ya no continúa
				);

	}

}
