package com.bhaskar.departmentservice.controller;

import com.bhaskar.departmentservice.entity.Department;
import com.bhaskar.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService service;

    @PostMapping(value = "/save")
    public Department save(@RequestBody Department department){

        return service.save(department);
    }
    @GetMapping(value = "/{id}")
    public Optional<Department> get(@PathVariable("id") Long id){

        return service.get(id);

    }
    @GetMapping(value = "/list")
    public List<Department> list(){
        return service.list();
    }
}
