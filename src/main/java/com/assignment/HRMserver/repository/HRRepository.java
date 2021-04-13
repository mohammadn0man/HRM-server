package com.assignment.HRMserver.repository;

import com.assignment.HRMserver.model.HRModel;
import org.springframework.data.repository.CrudRepository;

public interface HRRepository extends CrudRepository<HRModel, String> {

}
