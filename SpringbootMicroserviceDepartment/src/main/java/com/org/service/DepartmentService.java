package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.Department;
import com.org.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		System.out.println("Inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		System.out.println("Inside findDepartmentById of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
