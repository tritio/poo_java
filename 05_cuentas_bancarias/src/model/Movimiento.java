package model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Movimiento {
	
	private double cantidad;
	private LocalDateTime fechaHora;
	private String tipo;
	
}
