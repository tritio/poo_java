package service;

public class Punto3D extends Punto {
	private int z;
	
	public Punto3D(int z) {
	//	super(); // llamada a constructor sin parámetro de la superclase. Si no se pone, implícitamente lo pone
	// si en la clase padre existe un constructor con parámetros PERO no otro sin parámetros, aquí dará error, pero
   // si la clase padre no tuviese ningún constructor, java crea el llamado constructor por defecto.
		this.z = z;
	}

	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z = z;		
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println(", " + z);
	}	
	
	
	/*
	 * @Override public void imprimir() { System.out.println("las coordenadas son: "
	 * + getX() + ", " + getY() + ", " + z); }
	 */
	
}
