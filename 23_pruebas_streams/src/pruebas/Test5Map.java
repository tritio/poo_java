package pruebas;

import java.util.List;

public class Test5Map {

	public static void main(String[] args) {		
		List<String> cads = List.of("cadena", "otra", "fin", "sale", "casa", "paraiso");
		// muestra las longitudes de todas las cadenas sin repetir longitudes
		cads.stream() // Stream<String>
			.map(a->a.length()) // Stream<Integer>
			.distinct()
			.forEach(System.out::println);
	}

}
