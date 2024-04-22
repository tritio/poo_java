package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import models.Cuenta;

public class CuentasService {


List<Cuenta> cuentas=new ArrayList<Cuenta>(List.of(
			new Cuenta("ES1420800222823000247854",
		            "Fernando López Gómez", LocalDate.parse("2018-04-14"),
		            "EUR", Double.valueOf("125477.44")),
		    new Cuenta("ES3520800014523000687719",
		            "Marcos Pérez Sánchez", LocalDate.parse("1998-10-01"),
		            "EUR", Double.valueOf("9465.59")),		
		    new Cuenta("ES4720800136253000145866",
		            "Francisco González Fernández", LocalDate.parse("2000-11-03") ,
		            "JPY", 3258745.7),
		   new Cuenta("8747-369", "Kenji Nakamura",
				   LocalDate.parse("1984-06-17") , "JPY", 985471.4))); 


/*
 * public boolean existeCuenta(String numeroCuenta) { return cuentas.stream() }
 */

	// método que devuelva la cuenta asociada a un determinado número de cuenta
	public Cuenta buscarCuenta(String numero) {
		return cuentas.stream()
				.filter(c->c.getNumeroCuenta().equals(numero))
				.findFirst() // Optional<Cuenta>
				.orElse(null);
	}
	
	// método que devuelva la cuenta asociada a un determinado número de cuenta por titular
	// aquí devolvemos un Optional, que la capa de lógica ya trabajará
		public Optional<Cuenta> buscarCuentaPorTitulo(String titular) {
			return cuentas.stream()
					.filter(c->c.getTitular().equals(titular))
					.findFirst(); // Optional<Cuenta>					
		}
		
		// método que devuelva la cuenta con menor saldo
		
		public Cuenta buscarCuentaMenorSaldo() {
			return cuentas.stream()
					.sorted((a,b)-> Double.compare(a.getSaldo(),  b.getSaldo()))
					.findFirst() // Optional<Cuenta>
					.orElse(null);
				
			/* Otra opción utilizando .min()
			 * return cuentas.stream() .min((a,b)-> Double.compare(a.getSaldo(),
			 * b.getSaldo()) ).orElse(null);
			 */
					
			/*
			 * Otra forma más, utilizando la implementación de la interfaz Comparator return
			 * cuentas.stream()
			 * .min(Comparator.comparingDouble(c->c.getSaldo()).orElse(null)
			 */
		}
		
		// método que nos devuelva una LISTA de las cuentas de dicha divisa
		
		public List<Cuenta> listaCuentaPorDivisa(String Divisa) {
			return cuentas.stream()
					.filter(c-> c.getDivisa().equalsIgnoreCase(Divisa))
					.collect(Collectors.toList());
				//	.toList();
			//   en Java 16 se incorporó un método que lo hace directamente, .toList()
					
		}
		
		// método que devuelva un Map con los números de cuenta como claves, y saldos como valor
		
		public Map<String, Double> cuentasSaldo() {
			return cuentas.stream()
					.collect(Collectors.toMap(c->c.getNumeroCuenta(), c->c.getSaldo()));
		}
		
		// método que devuelve una tabla de cuentas agrupadas por divisa
		
		public Map<String, List<Cuenta>> cuentasPorDivisa() {
			return cuentas.stream()
				.collect(Collectors.groupingBy(c->c.getDivisa()));
		}
		
		


}
