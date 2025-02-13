package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.ExamResult;

public interface ExamResultRepository  extends JpaRepository<ExamResult, Long>{

}
