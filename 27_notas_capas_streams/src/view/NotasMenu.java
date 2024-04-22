package view;

import java.util.Arrays;
import java.util.Scanner;

import service.NotasService;

public class NotasMenu {
	static NotasService service = new NotasService();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			presentarMenu();
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				agregarNota();
				break;
			case 2:
				presentarMedia();
				break;
			case 3:
				presentarExtremas();
				break;
			case 4:
				mostrarTodas();
				break;
			case 5:
				System.out.println("hasta luego");
				break;
			default: 
				System.out.println("opción no válida");
			}				
		}while(opcion != 5); 

	}
	
	static void presentarMenu() {
		System.out.println("""
				
				1.- Agregar nota
				2.- Ver nota media
				3.- Ver nota máxima y mínima
				4.- Mostrar todas las notas
				5.- Salir
				""");
	
	}
	
	static void mostrarTodas() {
		/*
		 * Double [] notas = service.obtenerNotas(); for(Double nota:notas) {
		 * System.out.print(nota + ", "); }
		 */
		System.out.println("Las notas son: " + Arrays.toString(service.obtenerNotas()));
	}
	
	static void presentarMedia() {
		System.out.println("La media es: " + service.calcularMedia());
	}
	
	static void presentarExtremas() {
		System.out.println("La nota más alta es: " + service.max());
		System.out.println("La nota más baja es: " + service.min());
	}
	
	static void agregarNota() {
		double nota = 0;
		System.out.println("Introduce la nota: ");
		Scanner sc = new Scanner(System.in);
		nota = sc.nextDouble();
		service.agregarNota(nota);
		
	}
}
