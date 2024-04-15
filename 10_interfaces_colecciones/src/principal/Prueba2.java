package principal;

import java.util.ArrayList;
import java.util.List;

public class Prueba2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(11); nums.add(7); nums.add(12); nums.add(34);
		nums.add(56); nums.add(89); nums.add(23);
		
		List<Integer> sublista = nums.subList(3, 7);
		System.out.println(sublista.getClass().getSimpleName());
		for(Integer n: sublista) {
			System.out.println(n);
		}

	}

}
