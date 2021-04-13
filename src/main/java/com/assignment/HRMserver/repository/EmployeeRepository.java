package com.assignment.HRMserver.repository;

import com.assignment.HRMserver.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {

}
