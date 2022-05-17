package com.example.demo.employee.service;

import java.util.List;

import com.example.demo.employee.entity.Recognition;


public interface RecognitionService {
	
	//get all
	public List<Recognition>getAll2();
	
	
	//add recognation
	public Recognition saveRecognition(Recognition recognition);

}
