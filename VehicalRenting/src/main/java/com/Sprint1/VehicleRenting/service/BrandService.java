package com.Sprint1.VehicleRenting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Brand;

public interface BrandService {
	
	void updateBrand(Brand brand);
	void deleteBrand(int id);
	int countBrand(String brandName);
	List<Brand> viewBrand(String brandName);
	List<Integer> numberOfBrand();
	void insertBrand(Brand Brand);

}
