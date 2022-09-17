package com.rishi.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rishi.employee.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
