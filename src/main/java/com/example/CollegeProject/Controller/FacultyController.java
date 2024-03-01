package com.example.CollegeProject.Controller;

import com.example.CollegeProject.Model.College;
import com.example.CollegeProject.Model.Faculty;
import com.example.CollegeProject.Service.FacultyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty")

public class FacultyController {
    @Autowired
    public FacultyService service;



    @PostMapping("/{collegeId}/faculties")
    public Faculty addFacultyToCollege(@RequestBody Faculty faculty) {
        return service.addFacultyToCollege(faculty);
    }

    @GetMapping("/{collegeId}/faculties")
    public List<Faculty> getAllFacultiesByCollegeId(@PathVariable int collegeId) {
        return service.getAllFacultiesByCollegeId(collegeId);
    }
}









