package com.example.CollegeProject.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class College {
    @Id
    public long id;
    public String collegename;
    public String location;
    public String departments;
    public String courses;
    public String students;
    public String faculties;
    public double fees;
    public double phnnumber;
    public String email;

    @OneToMany(mappedBy = "college",cascade= CascadeType.ALL)
    private List<Department> department;
    @OneToMany( mappedBy = "college",cascade= CascadeType.ALL)
    private List<Faculty> faculty;

}
