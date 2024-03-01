package com.example.CollegeProject.Controller;

import com.example.CollegeProject.Model.Department;
import com.example.CollegeProject.Service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")

public class DepartmentController {

    @Autowired
    public DepartmentService Service;
    @PostMapping
    public Department adddepartment( @RequestBody Department department)
    {
        return Service.adddepartment(department);
    }
    @GetMapping("/get/{id}")
    public Department getdepartment(@PathVariable String id)
    {
        return Service.getdepartment(id);
    }








}
