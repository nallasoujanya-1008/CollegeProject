package com.example.CollegeProject.Service;

import com.example.CollegeProject.Model.College;
import com.example.CollegeProject.Model.Faculty;
import com.example.CollegeProject.repo.Collegerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {

    @Autowired
    private Collegerepo repo;
    public College addcollege(College college) {
        return repo.save(college);
    }

    public List<College> addcollege(List<College> colleges) {
        return repo.saveAll(colleges);
    }

    public List<College> getallcollege()
    {
        return repo.findAll();

    }

    public College getcollege(String  id)
    {
        return repo.findById(id) .orElse(null);
    }

    public String deletecollege(String fid) {
        repo.deleteById(fid);
        return "college removed !! " + fid;
    }


    public College updatecollege(College college) {
      return repo.save(college);

    }


}
