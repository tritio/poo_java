package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveIf {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(3, 18,-13, 6, 77, -89, 9));  
		// lo convertimos a ArrayList porque no podemos borrar nada de un inmutable como es List.of
		
		nums.removeIf(n -> n < 0);
		nums.forEach(n-> System.out.println(n));

	}

}
