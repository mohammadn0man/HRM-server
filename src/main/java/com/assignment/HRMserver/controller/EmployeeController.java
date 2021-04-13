package com.assignment.HRMserver.controller;

import com.assignment.HRMserver.model.EmployeeModel;
import com.assignment.HRMserver.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("employees")
    public List<EmployeeModel> getAll() {
        return (List<EmployeeModel>) repository.findAll();
    }

    @GetMapping("employee/{id}")
    public Optional<EmployeeModel> getById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("addemployee")
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employeeModel) {
        return repository.save(employeeModel);
    }

    @DeleteMapping("removeemployee/{id}")
    public Optional<EmployeeModel> removeEmployee(@PathVariable Long id) {
        Optional<EmployeeModel> model = repository.findById(id);
        repository.deleteById(id);
        return model;
    }

    @PutMapping("editemployee/{id}")
    public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeModel model, @PathVariable Long id) {

        Optional<EmployeeModel> hrModel = repository.findById(id);

        if (!hrModel.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        model.setEmployeeCode(id);

        repository.save(model);

        return ResponseEntity.noContent().build();
    }

}
