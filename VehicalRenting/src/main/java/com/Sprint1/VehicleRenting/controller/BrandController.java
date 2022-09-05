package com.Sprint1.VehicleRenting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {
	
	@Autowired
	BrandService brandService;
	
	@GetMapping("/getbrand")
	public List<Brand> getAllBrands()
	{
		List<Brand> brands=brandService.getAllBrands();
		return brands;
	}
	
	
	@PostMapping("/savebrand")
	public Brand saveBrand(@RequestBody Brand brand) {
		Brand brand1=brandService.saveBrand(brand);
		return brand1;
	}
	
	
	
	

}
