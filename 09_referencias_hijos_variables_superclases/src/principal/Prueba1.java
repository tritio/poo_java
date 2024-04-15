package principal;

class C1 {
	int a = 5;
	public void print() {
		System.out.println("C1");
	}
}

class C2 extends C1 {
	int a = 3;
	public void print() {
		System.out.println("C2");
	}
	public void send() {
		System.out.println("Enviando...");
	}
}

public class Prueba1 {

	public static void main(String[] args) {
		C1 c = new C2();
		c.print();  // imprime el print de C2
		System.out.println(c.a);  // se refiere a la de C1
		// c.send() no se pueden llamar a métodos de C2 si no existen también en C1
	}

}
