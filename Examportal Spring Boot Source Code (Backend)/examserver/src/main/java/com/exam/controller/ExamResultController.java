package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.ExamResult;
import com.exam.service.impl.ExamResultServiceImpl;

@RestController
@RequestMapping("result")
@CrossOrigin("*")
public class ExamResultController {

	@Autowired
	ExamResultServiceImpl service;

	@PostMapping()
	public void addResult(@RequestBody ExamResult examResult) {
		service.addResult(examResult);
		System.out.println("Result Addedd Successfully..!");
	}

}
