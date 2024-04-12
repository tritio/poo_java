package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimite {
	/*
	 * Clase CuentaMovimientos Clase que hereda CuentaLimite. Incopora un nuevo
	 * método obtenerMovimientos que devolverá un ArraList con los movimientos
	 * realizados en la cuenta Cada movimiento se define por: cantidad, fechaHora,
	 * tipo (ingreso o extracción)
	 */
	private ArrayList<Movimiento> movimientos = new ArrayList<>();

	public CuentaMovimientos(double saldo, double limite) {
		super(saldo, limite);
	}
	
	public CuentaMovimientos() {
		
	}		
	
	@Override
	public void extraer(double cantidad) {
		Movimiento m = new Movimiento(cantidad, LocalDateTime.now(), "extraccion");
		movimientos.add(m);		
		super.extraer(cantidad);
		
	}

	@Override
	public void ingresar(double cantidad) {
		Movimiento m = new Movimiento(cantidad, LocalDateTime.now(), "ingreso");
		movimientos.add(m);
		super.ingresar(cantidad);
	}


	public ArrayList<Movimiento> obtenerMovimientos() {
		return movimientos;
	}
}
