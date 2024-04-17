package view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Predicate;

import service.Condicion;
import service.OperacionesService;


public class AppNumeros  {

	public static void main(String[] args)  {
		
		List numeros = List.of(3, -2, 8, 5, 1, 17, 2, -9, 6, 12, 25);
		
		OperacionesService service = new OperacionesService();
		
		Condicion pares = n-> n%2 == 0; // expresión lambda
		
		// imprimir, por un lado, la suma de los pares y por otro la suma de los positivos
		
		System.out.println(service.sumarPorCondicion(numeros, n-> n > 0));  // expresión lambda
		System.out.println(service.sumarPorCondicion(numeros, pares));
		// suma los negativos mayores que -5
		
		System.out.println("Otra " + service.sumarPorCondicion(numeros, n -> n < 0 && n > -5));
		Predicate<Integer> negativo = n-> n < 0;
	//	System.out.println("Otra " + service.sumarPorCondicion(numeros, negativo.and(n -> n > -5)));
					
		service.procesarPorCondicion(numeros, n-> {
			try (FileOutputStream fos = new FileOutputStream("positivos.txt", true);
				 PrintStream out = new PrintStream(fos)) {
					 out.println(n);			 
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		}, n-> n > 0);
		
	}

}
