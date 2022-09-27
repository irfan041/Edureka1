package com.example.AOPDEmo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOPDEmo.annotation.CustomAnnotation;
import com.example.AOPDEmo.model.Department;

import com.example.AOPDEmo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department) {
		return departmentRepository.save(department);

	}

	 @CustomAnnotation
	public Department findById(Integer id) {
		return departmentRepository.findById(id).orElseThrow();
	}

}
