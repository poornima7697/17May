package com.example.demo.employee.service;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.entity.Recognition;
import com.example.demo.employee.repository.RecognitionRepository;

@Service
public class RecognitionSeviceImpl implements RecognitionService
{
	@Autowired
	private RecognitionRepository recognitionrepository;

	@Override
	public List<Recognition> getAll2() {
		return recognitionrepository.findAll();
	}

	@Override
	public Recognition saveRecognition(Recognition recognition) {
		// TODO Auto-generated method stub
		return recognitionrepository.save(recognition);
	}

}
