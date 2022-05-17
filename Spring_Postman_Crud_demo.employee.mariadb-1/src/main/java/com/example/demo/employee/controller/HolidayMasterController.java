package com.example.demo.employee.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.entity.HolidayMaster;

import com.example.demo.employee.service.HolidayMasterService;
@RestController
public class HolidayMasterController {
	
	@Autowired
	
	private HolidayMasterService holidaymasterservice;
	@GetMapping(value = "/getholidays1")
	public ResponseEntity<List<HolidayMaster>> getholidays1() {
		List<HolidayMaster> list = holidaymasterservice.getAll();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

	@GetMapping("/getholidays")
    public List<HolidayMaster> getholidays(){      
        return holidaymasterservice.getAllholidays();
     
    }

}
