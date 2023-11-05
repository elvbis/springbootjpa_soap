package com.demo.spring.soap.employee.emdpoint;

import com.demo.spring.soap.employee.service.EmployeeService;
import com.demo.spring.soap.swsoap.EmployeeRequest;
import com.demo.spring.soap.swsoap.EmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@AllArgsConstructor
public class EmployeeEndpoint {

	private static final String NAMESPACE = "http://www.demo.com/spring/soap/swsoap";
	private final EmployeeService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "EmployeeRequest")
	@ResponsePayload
	public EmployeeResponse
	getLoanStatus(@RequestPayload EmployeeRequest request) {
		return service.checkLoanEligibility(request);
	}

}
