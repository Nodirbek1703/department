package com.example.micros.departmentservice.service;

import com.example.micros.departmentservice.entity.Department;
import com.example.micros.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
      return  departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
