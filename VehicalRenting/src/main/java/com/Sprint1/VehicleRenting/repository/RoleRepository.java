package com.Sprint1.VehicleRenting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sprint1.VehicleRenting.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>{

}
