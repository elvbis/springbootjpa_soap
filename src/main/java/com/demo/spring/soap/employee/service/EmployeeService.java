package com.demo.spring.soap.employee.service;

import com.demo.spring.soap.employee.repository.EmployeeRepository;
import com.demo.spring.soap.employee.repository.entity.EmployeeEntity;
import com.demo.spring.soap.swsoap.EmployeeRequest;
import com.demo.spring.soap.swsoap.EmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeResponse checkLoanEligibility(EmployeeRequest request) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		Optional<EmployeeEntity> result = employeeRepository.findById(request.getId());
		EmployeeEntity entity = result.get();
		employeeResponse.setId(entity.getId());
		employeeResponse.setEmail(entity.getEmail());
		employeeResponse.setFirstName(entity.getFirstName());
		employeeResponse.setLastName(entity.getLastName());
		return employeeResponse;

	}

}
