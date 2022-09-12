package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.ValueObject.Department;
import com.org.ValueObject.ResponseTemplateVO;
import com.org.entity.User;
import com.org.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		System.out.println("Inside saveUser of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		System.out.println("Inside getUserWithDepartment of UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = 
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getDepartmentId(), Department.class);
		//"http://localhost:8090/department/" 
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
