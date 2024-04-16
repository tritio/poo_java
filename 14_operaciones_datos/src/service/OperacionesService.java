package service;

import java.util.List;

public class OperacionesService  {

	// principio de responsabilidad única:
	public int sumarPorCondicion(List<Integer> numeros, Condicion condicion) {
		int suma = 0;		
		for(int n: numeros) {
			if(condicion.test(n)) {
				suma += n;				
			}
		}	
		return suma;
	}	
}

