package com.Sprint1.VehicleRenting.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint1.VehicleRenting.entity.Brand;
import com.Sprint1.VehicleRenting.repository.BrandRepository;
import com.Sprint1.VehicleRenting.service.BrandService;
import com.Sprint1.VehicleRenting.service.VehicleService;
@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	BrandRepository repository;
	public String[] type = new String[] {"Suzuki", "Toyota", "Audi", "Hyundai"};
	
	@Override
	public void insertBrand(Brand Brand) {
		repository.save(Brand);
	}
	@Override
	public void updateBrand(Brand Brand) {
		repository.save(Brand);
	}
	@Override
	public void deleteBrand(int brandId) {
		repository.deleteById(brandId);
	}
	@Override
	public List<Integer> numberOfBrand() {
		List<Integer> count = new ArrayList();
		for(String Brand:type) {
			count.add(viewBrand(Brand).size());
		}
		return count;
	}
	

	@Override
	public List<Brand> viewBrand(String brandName){
		List<Brand> brandList = repository.findAll();
		if(brandName.equals("All")) {
			return brandList;
		}
		brandList = brandList.stream().filter(Brand -> Brand.getBrandName().equals(brandName)).collect(Collectors.toList());
		return brandList;
	}
	@Override
	public int countBrand(String brandName){
		List<Brand> brandList = repository.findAll();
		int count = (int)brandList.stream().filter(Brand -> Brand.getBrandName().equals(brandName)).count();
		return count;
	}

	
	
}
