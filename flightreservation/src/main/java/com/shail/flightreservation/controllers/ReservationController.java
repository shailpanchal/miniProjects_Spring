package com.shail.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shail.flightreservation.dto.ReservationRequest;
import com.shail.flightreservation.entities.Flight;
import com.shail.flightreservation.entities.Reservation;
import com.shail.flightreservation.repos.FlightRepository;
import com.shail.flightreservation.services.ReservationService;


@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightID, ModelMap modelMap) {
		Flight flight = flightRepository.findById(flightID).get();
		modelMap.addAttribute("flight", flight);
		
		return "completeReservation";
	}
	
	@RequestMapping(value = "/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation create succesfully and id is: " + reservation.getId());
		return "reservationConfirmation";
	}
	
}
