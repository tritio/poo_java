package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		FuncionalesService service = new FuncionalesService();
		
		// realizar una llamada a cada método de service
		 		 
		service.m1(Set.of(4, 5, 7), (a) -> a.length());
		service.m2(()->"cadena", (a)-> System.out.println(a*2));
		service.m3((a, b)-> a + b, (a, b)-> a*b.length());
		service.m4((a,b)->System.out.println(a + ", " + b*2), (a, b)-> (a.length() > b));
	    service.m5(()-> "cadena".length(), List.of("hola", "pepe"));
	    service.m6(Map.of("a", 1,"b", 2), (a,b)->System.out.println(a + ", " + b));
	    service.m7((a) -> List.of(a.length(), 9, 7) );

	}

}
