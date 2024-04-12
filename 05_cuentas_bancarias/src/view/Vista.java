package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaMovimientos;

public class Vista {

	static CuentaMovimientos service;	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("¿Cuál es su saldo? ");
		double saldo = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce límite: ");
		double limite = Double.parseDouble(sc.nextLine());		
		service=new CuentaMovimientos(saldo, limite);
		
		do {
			System.out.println("Seleccione opción: ");			
			presentarMenu();
			try {
			opcion = Integer.parseInt(sc.nextLine());		
			
				switch (opcion) {
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					verSaldo();
					break;	
				case 4: 
					System.out.println("hasta luego");
					break;				
				default: 
					System.out.println("opción no válida");
				}
			} catch(NumberFormatException ex){
				System.out.println("Debe introducir un número ");	
			}			
			
		}while(opcion!=4);
		

	}
	static void presentarMenu() {
		System.out.println("""
				1.- Ingresar
				2.- Extraer
				3.- Saldo y movimientos
				4.- Salir
				""");
	}
	
	static void ingresar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad a ingresar ");
		double ingreso = Double.parseDouble(sc.nextLine());
		service.ingresar(ingreso);		
	}
	
	static void extraer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad a extraer ");
		double extraer = Double.parseDouble(sc.nextLine());
		service.extraer(extraer);	
	}
	
	static void verSaldo() {
		ArrayList<Movimiento> movimientos = service.obtenerMovimientos();
		for(Movimiento m: movimientos) {
			System.out.println("Operación: " + m.getTipo() + " Cantidad: " + m.getCantidad() + " Fecha: " + " SALDO:  " + service.getSaldo());
			System.out.println(m);
		}
	}

}
