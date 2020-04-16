package com.shail.flightcheckin.integration;

import com.shail.flightcheckin.integration.dto.Reservation;
import com.shail.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
	
	}
