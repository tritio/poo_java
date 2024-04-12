package principal;

import java.util.HashSet;

class Ciudad {
	private String nombre;
	private int poblacion;
	public Ciudad(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	@Override
	public boolean equals(Object obj) {
		Ciudad aux = (Ciudad)obj;
		if(nombre.equals(aux.getNombre()) && poblacion== aux.getPoblacion() ) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return nombre.length() + poblacion;
	}
	@Override
	public String toString() {
		return "{\"nombre\":"+nombre+",\"poblacion\":"+poblacion+"}"; 
	}
	
		
}

public class Test {

	public static void main(String[] args) {
		
		HashSet<Ciudad> ciudades = new HashSet<Ciudad>();
		ciudades.add(new Ciudad("ciudadA", 200000));
		ciudades.add(new Ciudad("ciudadB", 340000));
		ciudades.add(new Ciudad("ciudadA", 200000));
		
		System.out.println(ciudades.size()); // resultado: 3
		
	 // en HashSet no admite dos items iguales, en este caso no lo son porque apuntan a distintas posiciones de memoria
	// esto internamente lo hace la clase Object con el método equals() asi que lo sobreescribimos en Ciudad
		// dos objetos son iguales si se cumplen dos condiciones, que al aplicar el equals() sea true, y que el hashCode sea el mismo
				
		for(Ciudad c: ciudades) {
			System.out.println(c.getNombre() + " - " + c.getPoblacion());
			System.out.println(c);  // utiliza internamente el método toString() que también lo hemos sobreescrito
		}
		
		System.out.println();
		
	}

}
