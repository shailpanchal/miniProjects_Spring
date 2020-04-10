package com.shail.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shail.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
