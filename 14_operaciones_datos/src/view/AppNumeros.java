package view;

import java.util.List;

import service.Condicion;
import service.OperacionesService;

class Positivos implements Condicion {
	@Override
	public boolean test(Integer n) {		
		return n > 0;
	}	
}

class Pares implements Condicion {
	@Override
	public boolean test(Integer n) {		
		return (n % 2 == 0);
	}	
}


public class AppNumeros  {

	public static void main(String[] args) {
		
		List numeros = List.of(3, -2, 8, 5, 1, 17, 2, -9, 6, 12);
		
		OperacionesService service = new OperacionesService();
		
		Positivos sumaPositivos = new Positivos();
		Pares sumaPares = new Pares();
		
		// imprimir, por un lado, la suma de los pares y por otro la suma de los positivos
		System.out.println(service.sumarPorCondicion(numeros, sumaPares));
		System.out.println(service.sumarPorCondicion(numeros, sumaPositivos));
		

	}

}
