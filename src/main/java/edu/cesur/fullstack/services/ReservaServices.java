package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.models.ReservaDTO;

public interface ReservaServices {

	ArrayList<ReservaDTO> getAllReservations(Long userId);
	
	ReservaDTO reserveBook(Long bookId, Long userId);
	
	void cancelReservation(Long bookId, Long userId);
}
