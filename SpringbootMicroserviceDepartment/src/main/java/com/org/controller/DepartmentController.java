package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Department;
import com.org.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentSevice;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("inside saveDepartment method of DepartmentController");
		return departmentSevice.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		System.out.println("inside findDepartmentById method of DepartmentController");
		return departmentSevice.findDepartmentById(departmentId);
	}
	
	
	
}
