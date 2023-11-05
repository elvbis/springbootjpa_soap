package com.demo.spring.soap.employee.repository.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class EmployeeEntity {

	@Id
	private String id;
	
	private String email;
	private String firstName;
	private String lastName;


}
