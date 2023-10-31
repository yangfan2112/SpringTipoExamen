package edu.cesur.fullstack.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaDTO {

	private Long id;

	private Long libroId;

	private Long usuarioId;

	private LocalDate fechaReserva;

	private LocalDate returnDate;
}
