package service;

public class CuentaLimite extends Cuenta {

	//	clase CuentaLimite
	//	Clase que hereda Cuenta. Incorporará un atributo "limite",
	//	para limitar la extracción a dicho valor.
	//	Además, añadiremos un método ajustarLimite(), que fijará el límite
	//	en la mitad del saldo 
	
	private double limite;
	
	
	public CuentaLimite(double saldo, double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	public CuentaLimite(double limite) {		
		this.limite = limite;
	}
	
	public CuentaLimite() {
		this.limite = 50;
	}

	public void ajustarLimite() {
		this.limite = getSaldo()/2;
	}

	@Override
	public void extraer(double cantidad) {
		if(cantidad < this.limite) {
			super.extraer(cantidad);
		}		
	}
	
}
