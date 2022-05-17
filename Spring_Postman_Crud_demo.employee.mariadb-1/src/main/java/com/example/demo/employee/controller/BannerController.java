package com.example.demo.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.entity.Banner;
import com.example.demo.employee.service.BannerService;

@RestController
@RequestMapping("/api")
public class BannerController {

	@Autowired
	private BannerService bannerService;

	@GetMapping(value = "/getBannersDetails")
	public ResponseEntity<List<Banner>> getBanner() {
		List<Banner> list = bannerService.getAllBanner();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	

}
