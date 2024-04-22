package models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cuenta {
	
	private String numeroCuenta;
	private String titular;
	private LocalDate fechaApertura;
	private String divisa;
	private double saldo;
}

/*
 * Aplicación banca. Operaciones con cuentas bancarias. Una cuenta se
 * caracteriza por lo siguientes datos: numeroCuenta titular fechaApertura
 * divisa saldo
 */