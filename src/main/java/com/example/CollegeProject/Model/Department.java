package com.example.CollegeProject.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

@Id
    public int dept_id;
    public String deptname;
    public String depthod;
    public String deptcode;
    public String deptfaculties;
    public String deptstudents;
    public double deptfees;
    public String sections;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "college_id",referencedColumnName = "id")
    public College college;

}
