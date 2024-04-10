package principal;

import service.Punto3D;

public class Test {

	public static void main(String[] args) {
		
		Punto3D pd = new Punto3D(3,8,25);
		Punto3D pd1 = new Punto3D(25);
		
		pd.imprimir();
		System.out.println();
		pd1.imprimir();
		
	}

}
