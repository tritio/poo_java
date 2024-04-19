package principal;

import java.time.LocalDate;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Director emp = new Director("Pepa", 45, LocalDate.of(1998, 10, 2), 2500, "contabilidad", 30);
		Operario op = new Operario("Jose", 35, LocalDate.of(2021, 10, 2), 1600, 2);
		op.incentivar();
		op.actualizarNivel();
		
		System.out.println(op.getNombre() + ", " + op.getNivelOperario() + ", " + op.getFechaIngreso());
	}

}
