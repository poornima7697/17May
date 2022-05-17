package com.example.demo.employee.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.entity.HolidayMaster;

@Repository
public interface HolidayMasterRepository extends JpaRepository<HolidayMaster, Integer>{
	
	@Query("from HolidayMaster where holidaydate>=current_date")
	
	public List<HolidayMaster>getupcommingholidays();

}
