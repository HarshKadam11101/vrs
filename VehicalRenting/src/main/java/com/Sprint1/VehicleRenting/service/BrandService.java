package com.Sprint1.VehicleRenting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Brand;

public interface BrandService {
	
	List<Brand> getAllBrands();
	Brand getBrand(long id);
	Brand saveBrand(Brand brand);
	Brand updateBrand(Brand brand);
	void deleteBrand(long id);

}
