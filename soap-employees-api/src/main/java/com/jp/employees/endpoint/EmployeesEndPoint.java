package com.jp.employees.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.jp.employees.jaxb.GetEmployeeRequest;
import com.jp.employees.jaxb.GetEmployeeResponse;

/*
 * @EndPoint regsiters class with spring-ws to handle incoming soap requests.
 * @RequestPayLoad -request pay load is mapped to java object
 * @ResponsePayLoad- java obect is mapped to response payload
 * @PayloadRoot is used to pick up the handler method based on namespace and localpart.
 * http://localhost:8181/ws/employees.wsdl
 */

@Endpoint
public class EmployeesEndPoint {
	
	
	
	
	
	@PayloadRoot(namespace="http://www.jp.com/ns/employees",localPart="GetEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
		GetEmployeeResponse response = new GetEmployeeResponse();
		response.setId(request.getId());
		response.setFirstName("Janardhan");
		response.setLastName("Polimetla");
		response.setSalary(1000d);
		response.setDepartment("Computers");
		
		return response;
	}

}
