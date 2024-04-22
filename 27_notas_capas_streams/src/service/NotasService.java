package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	public void agregarNota(double nota) {
		notas.add(nota);		
	}
	
	public  double calcularMedia() {	
		return  notas.stream()
			.mapToDouble(n-> n)
		 	.average()
		 	.orElse(0);
	}
	
	public double max() {
		return  notas.stream()
				.mapToDouble(n-> n)
			 	.max()
			 	.orElse(0);
	}
	
	public double min() {
		return  notas.stream()
				.mapToDouble(n-> n)
			 	.min()
			 	.orElse(0);
	}
			
	public int totalAprobados() {
		/*
		 * return (int) notas.stream() 
		 * .filter(n-> n > 5)
		 * .count();
		 */
		// otra forma:
		return notas.stream()
				.collect(Collectors.filtering(n-> n > 5, Collectors.counting())).intValue();
	}
	
	public Double[] obtenerNotas() {
		/*
		 * double [] todas = new double[notas.size()]; for(int i = 0; i < notas.size();
		 * i++) { todas[i] = notas.get(i); } return todas;
		 */
		return notas.toArray(new Double[0]);  // forma extraña pero más corta para convertir un ArrayList en un array. Pasando un array vacío del tipo que queremos.
			
	}
}
