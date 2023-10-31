package edu.cesur.fullstack.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import edu.cesur.fullstack.models.ReservaDTO;

public class ReservaServicesImpl implements ReservaServices{

	ArrayList<ReservaDTO> listaReserva = new ArrayList<>(Arrays.asList(new ReservaDTO(1L,1L,1L,LocalDate.of(19, 10, 2023),LocalDate.of(29, 10, 2023)),
			new Persona(2,"María","Gómez",30),
			new Persona(3,"Pedro","González",28)));
	@Override
	public ArrayList<ReservaDTO> getAllReservations(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservaDTO reserveBook(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservaDTO cancelReservation(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
