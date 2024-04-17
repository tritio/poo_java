package principal;


//class Positivos implements Condicion {
//	@Override
//	public boolean test(Integer n) {		
//		return n > 0;
//	}	
//}
//
//class Pares implements Condicion {
//	@Override
//	public boolean test(Integer n) {		
//		return (n % 2 == 0);
//	}	
//}

/*
class Cuadrado implements TransformarNumeros {
	@Override
	public Integer transformar(Integer n) {
		return (int) Math.pow(n, 2);
	}
}

class Mitad implements TransformarNumeros {
	@Override
	public Integer transformar(Integer n) {
		return n/2;
	}
}*/

/*class Cubica implements TransformarNumeros {
	@Override
	public Integer transformar(Integer n) {
		if(n < 0) {
			return (int) Math.cbrt(n);
		}
		return 0;
	}
}*/


public class Test {

	public static void main(String[] args) {
		
		ListNumber numero = new ListNumber();
		
		
		numero.add(68);
		numero.add(56);
		numero.add(278);
		numero.add(-578);
		numero.add(11);
		numero.add(35);
		System.out.println("primer número: " + numero.first());
		System.out.println("último número: " + numero.last());		
		numero.eliminarNumeros(n -> n % 2 == 0);		
		System.out.println("suma: " + numero.sum());
		
		// expresiones lambda;
		numero.tranformarNumeros(n-> (int) Math.cbrt(n));
		numero.tranformarNumeros(n -> (int) Math.pow(n, 2));
		numero.tranformarNumeros(n -> n/2);
    	
		
		for(Integer n: numero) {
			System.out.println(n);
		}
		
	}

}
