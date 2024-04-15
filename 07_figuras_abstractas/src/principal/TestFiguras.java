package principal;

import service.Circulo;
import service.Figura;
import service.Mesa;
import service.Operaciones;
import service.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {

		/*
		 * crear un triángulo y un círculo con color y 
		 * propiedades cualquiera, y después mostrar el color y 
		 * área de cada una		 * 
		 */
		
		
		
		Circulo cr = new Circulo("amarillo", 5);
	    Triangulo tr = new Triangulo("marrón", 5, 8);
	    
	    mostrarInfo(cr);
	    mostrarInfo(tr);
	    operar(new Mesa(2,11,5));
		
	}
	
	public static void mostrarInfo(Figura ob) {
		 System.out.println("color" + ob.getColor());
		 System.out.println("area" + ob.area());
	}
	
	public static void operar(Operaciones op) {
		op.girar(100);
		System.out.println(op.invertir());
	}

}
