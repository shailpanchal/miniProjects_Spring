package com.shail.flightreservation.services;

import com.shail.flightreservation.dto.ReservationRequest;
import com.shail.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
}
