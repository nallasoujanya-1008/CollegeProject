package com.example.CollegeProject.repo;

import com.example.CollegeProject.Model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface facultyrepo extends JpaRepository<Faculty,String> {
    List<Faculty> findAllByCollegeId(int collegeId);
}
