package principal;

public class Test {

	public static void main(String[] args) {
		
		ListNumber numero = new ListNumber();
		
		numero.add(68);
		numero.add(56);
		numero.add(578);
		numero.add(578);
		System.out.println("primer número: " + numero.first());
		
		for(Integer n: numero) {
			System.out.println(n);
		}
		
	}

}
