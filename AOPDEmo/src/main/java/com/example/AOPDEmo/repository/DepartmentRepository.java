package com.example.AOPDEmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AOPDEmo.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
