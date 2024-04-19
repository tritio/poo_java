package principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public abstract class  Empleado {
	private String nombre;
	private int edad;
	private LocalDate fechaIngreso; 
	private double salario;
	public static final double  BONO = 2000.0;
	
	public Empleado(String nombre, int edad, LocalDate fechaIngreso, int salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}
	public Empleado() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract void incentivar();
	
}

class Director extends Empleado {
	
	private String departamento;
	private int personal;
	
	public Director(String nombre, int edad, LocalDate fechaIngreso, int salario, String departamento, int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}
	
	public void incentivar() {		
	// 	Period period = Period.between(getFechaIngreso(), LocalDate.now().plusDays(1)); una opción Period otra opción con ChronoUnit
	//	if(period.toTotalMonths() > 30 && this.personal > 20)
		if(ChronoUnit.MONTHS.between(this.getFechaIngreso(), LocalDateTime.now()) > 30  && this.personal > 20) {
			this.setSalario(this.getSalario()+(2*Empleado.BONO));
		} else if(ChronoUnit.MONTHS.between(this.getFechaIngreso(), LocalDateTime.now()) >30  && this.personal > 20 || this.personal > 20) {
			this.setSalario(this.getSalario()+Empleado.BONO);
		} 
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}	
	
}

class Operario extends Empleado {

	private int nivelOperario;
	
	public Operario(String nombre, int edad, LocalDate fechaIngreso, int salario, int nivelOperario) {
		super(nombre, edad, fechaIngreso, salario);
		this.nivelOperario = nivelOperario;
	}
	
	public int getNivelOperario() {
		return nivelOperario;
	}

	public void setNivelOperario(int nivelOperario) {
		this.nivelOperario = nivelOperario;
	}

	public void incentivar() {
		if(this.getEdad() > 30  && this.nivelOperario > 2) {
			this.setSalario(this.getSalario()+(2*Empleado.BONO));
		} else if(ChronoUnit.YEARS.between(this.getFechaIngreso(), LocalDateTime.now()) >30  || this.nivelOperario > 2) {
			this.setSalario(this.getSalario()+Empleado.BONO);
		}		
	}
	
	public void actualizarNivel() {
		if(ChronoUnit.YEARS.between(this.getFechaIngreso(), LocalDateTime.now()) > 2) {
			if(this.nivelOperario < 5) {
				this.nivelOperario++;
			}			
		}
	}
	
}
