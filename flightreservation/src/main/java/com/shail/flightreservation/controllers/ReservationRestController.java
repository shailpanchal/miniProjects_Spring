package com.shail.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shail.flightreservation.dto.ReservationUpdateRequest;
import com.shail.flightreservation.entities.Reservation;
import com.shail.flightreservation.repos.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return reservationRepository.findById(id).get();
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepository.findById(request.getId()).get();
		reservation.setCheckedIn(request.getCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());
		Reservation updatedReservation = reservationRepository.save(reservation);
		return updatedReservation;
		
	}
}
