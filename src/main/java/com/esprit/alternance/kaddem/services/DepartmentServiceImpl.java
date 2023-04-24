package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Department;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements  IDepartmentService {

    DepartmentRepository departmentRepository;

    UniversiteRepository universiteRepository;


    @Override
    public List<Department> retrieveAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department retrieveDepartment(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department addDepartment(Department d) {
        return departmentRepository.save(d);
    }

    @Override
    public Department updateDepartment(Department d) {
        return departmentRepository.save(d);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);

    }


}
