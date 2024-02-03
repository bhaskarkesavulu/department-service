package com.bhaskar.departmentservice.impl;

import com.bhaskar.departmentservice.entity.Department;
import com.bhaskar.departmentservice.repository.DepartmentRepository;
import com.bhaskar.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;

    @Override
    public Department save(Department department) {
        log.info("Saved Department is {}", department);
        return repository.save(department);
    }

    @Override
    public Optional<Department> get(Long id) {
        log.info("Get Department By {} id is", +id);
        return repository.findById(id);
    }

    @Override
    public List<Department> list() {
        List<Department> departments = repository.findAll();
        log.info("List is {}", departments);
        return departments;
    }
}
