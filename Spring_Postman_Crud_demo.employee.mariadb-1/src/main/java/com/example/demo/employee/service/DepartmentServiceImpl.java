package com.example.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.Banner;
import com.example.demo.employee.entity.Department;
import com.example.demo.employee.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository deptrepository;
	

	@Override
	public List<Department> getAll1() {
	

		return deptrepository.findAll();
	}


}
