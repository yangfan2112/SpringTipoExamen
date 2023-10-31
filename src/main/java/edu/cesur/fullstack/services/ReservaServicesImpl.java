package edu.cesur.fullstack.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import edu.cesur.fullstack.models.ReservaDTO;
import edu.cesur.fullstack.models.UsuarioDTO;

public class ReservaServicesImpl implements ReservaServices{

	ArrayList<ReservaDTO> reservas = new ArrayList<ReservaDTO>();
	@Override
	public ArrayList<ReservaDTO> getAllReservations(Long userId) {
		// TODO Auto-generated method stub
		return reservas;
	}

	@Override
	public ReservaDTO reserveBook(Long bookId, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelReservation(Long bookId, Long userId) {
		
	}

	
}
