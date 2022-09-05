package com.Sprint1.VehicleRenting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sprint1.VehicleRenting.entity.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository< Vehicle, Integer>  {
	
	Optional<Vehicle> findByVehicleName(String name);
	
	Optional<Vehicle> findByVehicleId(int vehilcleId);
	

}