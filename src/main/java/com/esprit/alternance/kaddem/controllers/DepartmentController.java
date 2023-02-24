package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Department;
import com.esprit.alternance.kaddem.services.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("/departments")
    public List<Department> retrieveAllDepartment() {
        return departmentService.retrieveAllDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department retrieveDepartment(Long id) {
        return departmentService.retrieveDepartment(id);
    }

    @PostMapping("/departments/add")
    public Department addDepartment( @RequestBody Department d) {
        return departmentService.addDepartment(d);
    }

    @DeleteMapping("/departments/delete/{id}")
    public void deleteDepartment(Long id) {
        departmentService.deleteDepartment(id);
    }
    


}
