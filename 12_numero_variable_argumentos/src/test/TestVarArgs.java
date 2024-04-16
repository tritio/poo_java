package test;

public class TestVarArgs {

	public static void main(String[] args) {

		// crear un método que devuelva una cadena con la unión de 
		// todos los textos recibidos como parámetros, separándolos por la coma
		System.out.println(union("hola", "que", "tal"));
		System.out.println(union(new String[] {"1", "a", "pepe"}));
	}

	static String union(String...data) {  // ... significa número variable de argumentos. La variable data será un array
		StringBuilder builder = new StringBuilder();
		for (String s: data) {
			builder.append(s);
			builder.append(",");
		}
		System.out.println(builder.capacity());
		return builder.toString();
	}
}

