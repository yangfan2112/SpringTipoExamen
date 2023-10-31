package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.models.ReservaDTO;

public interface ReservaServices {

	public ArrayList<ReservaDTO> getAllReservations(Long userId);
	
	public ReservaDTO reserveBook(Long bookId, Long userId);
	
	public ReservaDTO cancelReservation(Long bookId, Long userId);
}
