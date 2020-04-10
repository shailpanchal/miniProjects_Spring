package com.shail.flightreservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shail.flightreservation.entities.Flight;
import com.shail.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	
	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from")String from,@RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "MM-DD-YYYY") Date departureDate, ModelMap modelMap) {
		
		List<Flight> flights = flightRepository.findFlights(from,to,departureDate);
		modelMap.addAttribute("flights", flights);
		return "displayFlights";
	}
}
