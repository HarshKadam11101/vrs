package com.Sprint1.VehicleRenting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sprint1.VehicleRenting.entity.Customer;




	public interface CustomerRepository extends JpaRepository <Customer,Integer>{
}
