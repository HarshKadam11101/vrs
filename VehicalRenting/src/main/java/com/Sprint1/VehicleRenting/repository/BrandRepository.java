package com.Sprint1.VehicleRenting.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sprint1.VehicleRenting.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>  {
	
	Optional<Brand> findByBrandName(String name);
	
	Optional<Brand> findByBrandId(int id);

}
