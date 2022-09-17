package com.rishi.employee.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.rishi.employee.Dto.DesignationDto;
import com.rishi.employee.Dto.EmployeeResponseDto;
import com.rishi.employee.Entity.Employee;
import com.rishi.employee.Repository.EmployeeRepository;
import com.rishi.employee.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Transactional
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Transactional(readOnly = true)
	public EmployeeResponseDto getEmployeeById(Long id) {
		EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
		
		Employee employee = employeeRepository.findById(id).get();
		DesignationDto designationDto = restTemplate.getForObject("http://DESIGNATION/designation/designation/" + employee.getId(), DesignationDto.class);
		
		employeeResponseDto.setEmployee(employee);
		employeeResponseDto.setDesignationdto(designationDto);
		
		return employeeResponseDto;
		
	}

}
