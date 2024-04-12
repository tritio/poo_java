package pruebas;

class C1 {
	C1() {
		System.out.println("c1");
	}
}

class C2 extends C1 {
		
	}


class C3 extends C2{
	C3() {
		System.out.println("IMPRIME c3");
	}
}

// se imprime c1 y IMPRIME C3, porque aunque no pongamos super(), todos los constructores cuando extienden ejecutan ese primero.

public class Test1 {

	public static void main(String[] args) {
		C3 a = new C3();
	}

}
