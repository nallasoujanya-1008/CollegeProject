package com.example.CollegeProject.repo;

import com.example.CollegeProject.Model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Collegerepo extends JpaRepository<College,String> {



}
