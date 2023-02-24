package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Department;

import java.util.List;

public interface IDepartmentService {

    List<Department> retrieveAllDepartment();

    Department retrieveDepartment(Long id);

    Department addDepartment(Department d);

    Department updateDepartment(Department d);

    void deleteDepartment(Long id);

    
}
