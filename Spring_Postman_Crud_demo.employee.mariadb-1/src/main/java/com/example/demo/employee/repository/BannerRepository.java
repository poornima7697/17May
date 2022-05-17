package com.example.demo.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.entity.Banner;
@Repository
public interface BannerRepository extends JpaRepository<Banner, Integer> 
{

}
