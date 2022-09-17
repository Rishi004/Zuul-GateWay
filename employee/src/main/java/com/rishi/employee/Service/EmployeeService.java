package com.rishi.employee.Service;

import com.rishi.employee.Dto.EmployeeResponseDto;
import com.rishi.employee.Entity.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public EmployeeResponseDto getEmployeeById(Long id);
}
