package com.example.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.employee.entity.MessageMaster;
import com.example.demo.employee.repository.MessageMasterRepositoy;


@Service
public class MessageMasterServiceImpl implements MessageMasterService {
	
	@Autowired
	private MessageMasterRepositoy messagemasterrepositoy;

	@Override
	public List<MessageMaster> getAll() {
		// TODO Auto-generated method stub
		return messagemasterrepositoy.findAll();
	}

	
	
	

}
