package com.Sprint1.VehicleRenting.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.repository.BrandRepository;
import com.Sprint1.VehicleRenting.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService{
	
	
	@Autowired
	BrandRepository brandRepository;

	@Override
	public List<Brand> getAllBrands() {
		// TODO Auto-generated method stub
		List<Brand> brandList=brandRepository.findAll();
		
		return brandList;
	}

	@Override
	public Brand getBrand(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand saveBrand(Brand brand) {
		// TODO Auto-generated method stub
		
		Brand brandEntity=new Brand();
		brandEntity.setBrandId(brand.getBrandId());
		brandEntity.setBrandName(brand.getBrandName());
		brandEntity.setLaunchYear(brand.getLaunchYear());
		brandRepository.save(brandEntity);
		return brand;
	}

	@Override
	public Brand updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBrand(long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
