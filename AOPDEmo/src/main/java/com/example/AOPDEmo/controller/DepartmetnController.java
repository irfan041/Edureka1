package com.example.AOPDEmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AOPDEmo.model.Department;

import com.example.AOPDEmo.service.DepartmentService;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmetnController {
	
	@Autowired
	 private DepartmentService departMentService;
	
	 @PostMapping
	 public Department save(@RequestBody Department employee) {
		 return departMentService.save(employee);
	 }
	 
	 @GetMapping("/{id}")
	 public Department findById(@PathVariable(value="id") Integer id) {
		 return departMentService.findById(id);
	 }
	 

}
