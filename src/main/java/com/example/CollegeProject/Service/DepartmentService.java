package com.example.CollegeProject.Service;

import com.example.CollegeProject.Model.Department;
import com.example.CollegeProject.repo.deptrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DepartmentService {

    @Autowired
    private deptrepo repo;

    public Department adddepartment(Department department) {
        return repo.save(department);
    }

    public Department getdepartment(String id) {
        return repo.findById(id).orElse(null);
    }
}
