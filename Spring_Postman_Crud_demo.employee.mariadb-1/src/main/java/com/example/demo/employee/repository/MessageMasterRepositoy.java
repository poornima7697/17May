package com.example.demo.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.employee.entity.MessageMaster;

@Repository
public interface MessageMasterRepositoy extends JpaRepository<MessageMaster, Integer>
{

}
