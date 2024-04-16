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
	
	/*
	 * // ejemplos
	 * 
	 * Dadas esta clase e interfaces:
	 * 
	 * class C1{}
	 * interface I1{}
	 * interface I2{}
	 * 
	 * ¿Cuales de las siguientes definiciones son correctas?
	 * a.-class C2 implements I2 extends C1{} // Mal. Se pone primero extends y después el implements
	 * b.-class C3 extends I1, I2{} // Una clase implementa una interfazno la hereda
	 * c.-interface IA implements I1{} // Mal. Una interfaz NO implementa otra. En todo caso podría heredar otra
	 * d.-class C4 extends C1 implements I1, I2{} // Correcto 
	 * e.-interface IB extends C1, I1, I2{} // MAL. La interfaz no puede heredar una clase, pero sí dos interfaces
	 */
	/*
	 * interface I1{ 
	 * 		void print();
	 *  } 
	 * class CA implements I1{
	 * 		public void print(){
	 * 		System.out.println("CA");
	 * 	 } 
	 *  }
	 *  class CB extends CA{
	 *  	 public void print(){
	 * 		System.out.println("CB"); 
	 * 		}
	 *  }
	 *  I1 i=(CA)(new CB()); // CA es superclase de CB por lo que se puede hacer el casting, aunque no tiene 
	 *  mucho sentido porque  CB ya extiende de CA
	 *  i.print();   // IMPRIME CB. El objeto i sigue siendo un objeto tipo B
	 * 
	 */
}
