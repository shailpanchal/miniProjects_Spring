package com.shail.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shail.location.entities.Location;
import com.shail.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelmap ) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Location saved with id: "+locationSaved.getId();
		modelmap.addAttribute("msg", msg); //this is keyValue pair means wherever we use ${msg} it will show the msg
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelmap) {
		List<Location> locations = service.getAllLocations();
		modelmap.addAttribute("locations", locations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelmap) {
		// get the location by fetching the key, here ID, by requesting parameter
		Location location = service.getLocationById(id);
		service.deleteLocation(location);
		//send the response in locations
		List<Location> locations = service.getAllLocations();
		modelmap.addAttribute("locations", locations);
		// return to the display location.jsp
		return "displayLocations";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelmap) {
		Location location = service.getLocationById(id);
		modelmap.addAttribute("location", location);
		return "updateLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelmap) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelmap.addAttribute("locations", locations);
		return "displayLocations";
	}
}
