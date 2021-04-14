package com.assignment.hrm.server.repository;

import com.assignment.hrm.server.model.HRModel;
import org.springframework.data.repository.CrudRepository;

public interface HRRepository extends CrudRepository<HRModel, String> {

}
