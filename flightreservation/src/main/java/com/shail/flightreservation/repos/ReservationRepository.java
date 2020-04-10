package com.shail.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shail.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
