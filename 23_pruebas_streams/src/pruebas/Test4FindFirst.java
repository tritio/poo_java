package pruebas;

import java.util.List;

public class Test4FindFirst {

	public static void main(String[] args) {
		
	
	List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, 6, 98);
	//mostrar el primer número negativo
	
		nums.stream()
		.filter(n->n<0)
		.findFirst()
		.ifPresentOrElse(n->System.out.println(n),
				()->System.out.println("no hay negativos"));
	
	}
}
