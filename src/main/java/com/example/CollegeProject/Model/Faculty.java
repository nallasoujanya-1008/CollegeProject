package com.example.CollegeProject.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty {
@Id
     public String fid;
    public String facultyName;
    public String collegeName;
    public String departments;
    public double fees;
    public String faculties;
    public double phnnumber;
    public String facultyemail;
    public String facultyaddress;
    public String facultygender;
    public String facultyqualification;
    public int facultyexperience;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "college_id",referencedColumnName = "id")
    public  College college;


}
