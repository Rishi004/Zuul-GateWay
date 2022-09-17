package com.rishi.employee.Dto;

import com.rishi.employee.Entity.Employee;
import lombok.Data;

@Data
public class EmployeeResponseDto {
	public Employee employee;
	public DesignationDto designationdto;
}
