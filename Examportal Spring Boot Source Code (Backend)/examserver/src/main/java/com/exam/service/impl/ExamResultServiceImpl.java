package com.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.ExamResult;
import com.exam.repo.ExamResultRepository;
import com.exam.service.ExamResultService;

@Service
public class ExamResultServiceImpl implements ExamResultService {

	@Autowired
	ExamResultRepository repo;

	@Override
	public void addResult(ExamResult examResult) {
		repo.save(examResult);
		System.out.println("Result Addedd Successfully... into Databases..!");
	}

}
