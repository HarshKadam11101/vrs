package com.Sprint1.VehicleRenting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sprint1.VehicleRenting.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>  {
	
	public Brand  findByBrandName(String name);
	
	public Brand findByBrandId(int id);

}
