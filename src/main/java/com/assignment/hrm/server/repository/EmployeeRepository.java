package com.assignment.hrm.server.repository;

import com.assignment.hrm.server.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

/**
 * EmployeeRepository to interact with Employee Table in the database
 */
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
}
