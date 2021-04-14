package com.assignment.hrm.server.repository;

import com.assignment.hrm.server.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {

}
