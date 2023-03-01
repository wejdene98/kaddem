package com.esprit.alternance.kaddem.controllers;

import com.esprit.alternance.kaddem.entities.Department;
import com.esprit.alternance.kaddem.services.DepartmentServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Department", description = "Crud departments")
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @Operation(description = "Get All Departments")
    @GetMapping("/departments")
    public List<Department> retrieveAllDepartment() {
        return departmentService.retrieveAllDepartment();
    }

    @Operation(description = "Get Department")
    @GetMapping("/departments/{id}")
    public Department retrieveDepartment(Long id) {
        return departmentService.retrieveDepartment(id);
    }

    @Operation(description = " add department ")
    @PostMapping("/departments/add")
    public Department addDepartment( @RequestBody Department d) {
        return departmentService.addDepartment(d);
    }

    @Operation(description = "Update Department")
    @PutMapping("/departments/update/{idDepart}")
    public Department updateDepartment
            (@PathVariable(name="idDepart") Long idDepart, @RequestBody Department d) {
        return departmentService.updateDepartment( d);
    }

    @Operation(description = "Delete Department")
    @DeleteMapping("/departments/delete/{idDepart}")
    public void deleteDepartment(@PathVariable("idDepart") Long idDepart) {
        departmentService.deleteDepartment(idDepart);
    }



}
