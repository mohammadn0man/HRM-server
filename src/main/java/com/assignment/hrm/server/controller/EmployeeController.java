package com.assignment.hrm.server.controller;

import com.assignment.hrm.server.dto.EmployeeDto;
import com.assignment.hrm.server.model.EmployeeModel;
import com.assignment.hrm.server.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * EmployeeController
 * methods mapped with url paths
 * <p>employees : returns the list if all the employees</p>
 * <p>employees/id : returns employee with given id else null</p>
 * <p>addemployee : add new employee with new id</p>
 * <p>deleteemployee : remove employee with given id if exist</p>
 * <p>editemployee/editemp : update employee with given id if exist</p>
 */

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
    public EmployeeModel createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeModel employeeModel = new EmployeeModel(
                employeeDto.getEmployeeCode(),
                employeeDto.getEmployeeName(),
                employeeDto.getLocation(),
                employeeDto.getEmail(),
                employeeDto.getDateOfBirth()
        );
        return repository.save(employeeModel);
    }

    @DeleteMapping("removeemployee/{id}")
    public Optional<EmployeeModel> removeEmployee(@PathVariable Long id) {
        Optional<EmployeeModel> model = repository.findById(id);
        repository.deleteById(id);
        return model;
    }

    @PutMapping("editemployee/{id}")
    public ResponseEntity<Object> updateEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable Long id) {

        EmployeeModel model = new EmployeeModel(
                employeeDto.getEmployeeCode(),
                employeeDto.getEmployeeName(),
                employeeDto.getLocation(),
                employeeDto.getEmail(),
                employeeDto.getDateOfBirth()
        );
        Optional<EmployeeModel> hrModel = repository.findById(id);

        if (!hrModel.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        model.setEmployeeCode(id);

        repository.save(model);

        return ResponseEntity.noContent().build();
    }

    @PostMapping("/editemp")
    public EmployeeModel updateEmp(@RequestBody EmployeeDto employeeDto) {

        System.out.println(employeeDto);

        EmployeeModel model = new EmployeeModel(
                employeeDto.getEmployeeCode(),
                employeeDto.getEmployeeName(),
                employeeDto.getLocation(),
                employeeDto.getEmail(),
                employeeDto.getDateOfBirth()
        );
        Optional<EmployeeModel> hrModel = repository.findById(employeeDto.getEmployeeCode());

        if (!hrModel.isPresent()) {
            return new EmployeeModel();
        }

        model.setEmployeeCode(employeeDto.getEmployeeCode());

        repository.save(model);

        return model;
    }

}
