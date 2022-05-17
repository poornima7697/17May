package com.example.demo.employee.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.entity.HolidayMaster;
import com.example.demo.employee.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	

	public User findByAitid(String aitid);
	
//	@Query("select u.dob from User u where u.dob = :d ")
//	public User findByDob(@Param("d") Date dob);
//	
//	@Query("User u where day(u.birthday) = day(CURRENT_DATE) and month(u.birthday) = month(CURRENT_DATE)")
//	public List<User>todaysbirthday(dob);
	
	public List<User> findBydob(Date dob);

}
