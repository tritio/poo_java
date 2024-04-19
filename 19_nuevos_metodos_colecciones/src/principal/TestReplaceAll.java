package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(3, 18,-13, 6, 77, -89, 9));  
		nums.replaceAll(n -> n/2);
		nums.forEach(n-> System.out.println(n));
	}

}
