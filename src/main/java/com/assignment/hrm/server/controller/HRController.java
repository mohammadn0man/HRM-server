package com.assignment.hrm.server.controller;

import com.assignment.hrm.server.dto.HRDto;
import com.assignment.hrm.server.model.HRModel;
import com.assignment.hrm.server.repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HRController {

    @Autowired
    HRRepository repository;

    @GetMapping("hr")
    public List<HRModel> getAll() {
        return (List<HRModel>) repository.findAll();
    }

    @GetMapping("hr/{id}")
    public Optional<HRModel> getById(@PathVariable String id) {
        return repository.findById(id);
    }

    @PostMapping("addhr")
    public HRModel createHR(@RequestBody HRDto hrDto) {
        HRModel hrModel = new HRModel(
                hrDto.getUserId(),
                hrDto.getPassword()
        );
        return repository.save(hrModel);
    }

    @DeleteMapping("removehr/{id}")
    public Optional<HRModel> removeHR(@PathVariable String id) {
        Optional<HRModel> model = repository.findById(id);
        repository.deleteById(id);
        return model;
    }

    @PutMapping("edithr/{id}")
    public ResponseEntity<Object> updateStudent(@RequestBody HRDto hrDto, @PathVariable String id) {

        HRModel model = new HRModel(
                hrDto.getUserId(),
                hrDto.getPassword()
        );

        Optional<HRModel> hrModel = repository.findById(id);

        if (!hrModel.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        model.setUserId(id);

        repository.save(model);

        return ResponseEntity.noContent().build();
    }

}
