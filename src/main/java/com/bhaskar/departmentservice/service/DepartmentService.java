package com.bhaskar.departmentservice.service;

import com.bhaskar.departmentservice.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

public Department save(Department department);
public Optional<Department> get(Long id);
public List<Department> list();
}
