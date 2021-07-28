package com.example.micros.departmentservice.controller;

import com.example.micros.departmentservice.entity.Department;
import com.example.micros.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(Department department){
        log.info("department saved"+department);

        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartment(Long departmentId) {
        log.info("department found");
        return departmentService.getDepartment(departmentId);
    }
}
