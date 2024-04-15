package service;

public class Mesa implements Operaciones {
	
	double alto, ancho, largo;
	
	public Mesa(double alto, double ancho, double largo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public void girar(int grados) {
		System.out.println("grados girados: " + grados);
		alto += grados;
	}
	
	public double invertir() {
		return alto*ancho*largo;
	}

	
}
