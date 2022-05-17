package com.example.demo.employee.controller;

import java.util.List;
import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.entity.Banner;
import com.example.demo.employee.entity.Department;
import com.example.demo.employee.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	
	private DepartmentService departmentService;
	
	@GetMapping(value = "/getdepartment")
	public ResponseEntity<List<Department>> getDepartment() {
		List<Department> list = departmentService.getAll1();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	

}
