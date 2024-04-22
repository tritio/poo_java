package pruebas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8Partition {

	public static void main(String[] args) {

		List<Integer> nums = List.of(25, 2, 8, -3, 4, 11, -6, 98);
		
		// crear una tabla donde estén agrupados los negativos por un lado y los positivos por otro
		
		Map<Boolean, List<Integer>> tabla = nums.stream()
				.collect(Collectors.partitioningBy(n -> n > 0));
		
		Map<Boolean, Integer> tablaSumada = nums.stream()
				.collect(Collectors.partitioningBy(n-> n > 0,  Collectors.summingInt(n-> n)));
	}
	
		

}
