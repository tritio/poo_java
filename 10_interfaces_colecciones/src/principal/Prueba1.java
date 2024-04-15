package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Prueba1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList<Integer>();
		nums.add(200);
		nums.add(300);
		nums.add(21);
		nums.add(5);
		System.out.println("suma ArrayList: " + sumaPares(nums));
		
		Vector<Integer> nums2 = new Vector<Integer>();
		nums2.add(3);
		nums2.add(5);
		nums2.add(6);
		nums2.add(42);
		System.out.println("suma vector: " + sumaPares(nums2));
		
		ArrayList<Integer> miArrayList = new ArrayList<>();
		miArrayList.add(8);
		miArrayList.add(18);
		miArrayList.add(5);
		System.out.println("La media de mi ArrayList: " + media(miArrayList));
		
		HashSet<Integer> horas=new HashSet<>();
		horas.add(5);
		horas.add(22);
		horas.add(9); 
		System.out.println("La media de mi HashSet: " + media(horas));
		
	}
	
	// crear un método que reciba una lista de Integer 
	// y devuelva la suma de los pares de dicha lista
	
	public static int sumaPares(List<Integer> lista) {
		int suma=0;
		
		for(Integer i: lista) {
			if(i%2==0) {
				suma+= i;
			}			
		}
		return suma;		
	}
	
	public static double media(Collection<Integer> coleccion) {
		double suma = 0;
		
		for(Integer i: coleccion) {
			suma += i;				
		}
		return suma/coleccion.size();
	}

}
