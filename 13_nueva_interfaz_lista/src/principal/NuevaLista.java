package principal;

import java.util.ArrayList;
import java.util.List;

/*
Crear una subinterfaz de List<Integer>, que añada los siguientes métodos estáticos:

-List<Integer> ofPares(int n). Devuelve una lista con los n primeros numeros pares

-List<Integer> ofPositivos(int ... data). Devuelve una lista solo con los números positivos del grupo de números recibidos como parámetro 
*/

interface NuevoInterfaceLista extends List<Integer> {
	
	static List<Integer> ofPares(int n) {
		Integer[] pares = new Integer[n];
		int num=0, cont = 0;
		while(cont < n) {
			pares[cont] = num;
			num += 2;
			cont++;
		}
		return List.of(pares);
		
	}
	
	static List<Integer> ofPositivos(int...data) {
		
		List<Integer> positivos = new ArrayList<Integer>();
		
		for(int p: data) {
			if(p >=0) {
				positivos.add(p);
			}
		}		
		return positivos;
	}
}

public class NuevaLista {

	public static void main(String[] args) {		
		System.out.println(NuevoInterfaceLista.ofPares(34));
		System.out.println(NuevoInterfaceLista.ofPositivos(8, -6, 78, -896, 54, 90, -32));	
		System.out.println(NuevoInterfaceLista.ofPositivos(new int[] {4, 5, -67, 9, -34}));
	}

}
