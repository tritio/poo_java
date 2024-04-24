package pruebas;

import java.util.Arrays;
import java.util.Comparator;

public class Test9Ordenacion {

	public static void main(String[] args) {
		String[] textos = {"hello", "by", "car", "send", "enter", "clear", "in", "step"};
			// muestra las palabras ordenadas de menos a más caracteres
		// si tienen el mismo número de caracteres, entonces las ordenas alfabéticamente
		// Comparator<String> c1 = (a,b)-> a.length()-b.length();
		// Comparator<String> c2 = c1.thenComparing((a,b)-> a.compareTo(b));
		//Arrays.stream(textos)  // generar un Comparator que sea la unión de los dos
		// 	.sorted(c2)	// o también, si solo pidieran ordenar los caracteres	.sorted(Comparator.comparingInt(a->a.length()))			
	//		.forEach(System.out::println);
		
		// otra forma más compacta
		Arrays.stream(textos)
		.sorted(Comparator.comparingInt((String a)->a.length()).thenComparing((a,b)->a.compareTo(b)))		
		.forEach(System.out::println);
		
		
	}

}
