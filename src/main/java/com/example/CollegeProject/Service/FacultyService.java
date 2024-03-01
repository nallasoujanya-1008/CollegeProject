package com.example.CollegeProject.Service;

import com.example.CollegeProject.Model.Faculty;
import com.example.CollegeProject.repo.facultyrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FacultyService {
    @Autowired
    public facultyrepo repo;


    public Faculty addFacultyToCollege(Faculty faculty) {
        return repo.save(faculty);
    }

    public List<Faculty> getAllFacultiesByCollegeId(int collegeId) {
        return repo.findAllByCollegeId(collegeId);
    }
}
