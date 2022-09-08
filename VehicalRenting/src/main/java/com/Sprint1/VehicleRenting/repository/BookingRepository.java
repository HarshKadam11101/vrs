package com.Sprint1.VehicleRenting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sprint1.VehicleRenting.entity.Booking;

public interface BookingRepository extends JpaRepository <Booking,Integer>{

}
