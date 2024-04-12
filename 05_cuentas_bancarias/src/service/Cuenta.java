package service;

public class Cuenta {
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public Cuenta() {
		saldo = 100;
	}
	
	public void extraer(double cantidad) {
		saldo -= cantidad;
	}
	
	public void ingresar (double cantidad) {
		saldo += cantidad;
	}
	
	public double ObtenerSaldo() {
		return saldo;	
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
