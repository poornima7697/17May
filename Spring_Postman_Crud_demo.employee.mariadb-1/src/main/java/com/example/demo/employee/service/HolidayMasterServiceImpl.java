package com.example.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.HolidayMaster;
import com.example.demo.employee.repository.HolidayMasterRepository;

@Service
public class HolidayMasterServiceImpl implements HolidayMasterService {
	
	@Autowired
	private HolidayMasterRepository holidaymasterrepository;

	@Override
	public List<HolidayMaster> getAll() {
		
		return holidaymasterrepository.findAll();
	}

	@Override
	public List<HolidayMaster> getAllholidays() {
		// TODO Auto-generated method stub
		return holidaymasterrepository.getupcommingholidays();
	}
	

}
