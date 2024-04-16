package interfaces;

interface I1 {
	static void print() { 
		System.out.println("I1");
	}
}

class C implements I1 {
	
}

interface I2 extends I1 {
	
}

public class TestInterfaces {

	public static void main(String[] args) {

	//	C.print()  // no se hereda. Los métodos estáticos de una interfaz son EXCLUSIVOS de esa la interfaz
	//	I2.print(); // no se hereda.  Los métodos estáticos de una interfaz son EXCLUSIVOS de esa la interfaz
		I1.print();
	}

}
