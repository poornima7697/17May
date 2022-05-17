package com.example.demo.employee.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.entity.MessageMaster;
import com.example.demo.employee.service.MessageMasterService;

@RestController
public class MessageMasterController {
	@Autowired

	private MessageMasterService messagemasterService;

	@GetMapping(value = "/getMessage")
	public ResponseEntity<List<MessageMaster>> getRecognition() {
		List<MessageMaster> list = messagemasterService.getAll();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}

}
