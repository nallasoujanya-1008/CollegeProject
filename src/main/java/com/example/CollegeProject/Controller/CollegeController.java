package com.example.CollegeProject.Controller;

import com.example.CollegeProject.Model.College;
import com.example.CollegeProject.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/add college")
public class CollegeController {
    @Autowired
    private CollegeService service;
    @PostMapping("/add")
    public College addcollege( @RequestBody  College college)
    {
        return service.addcollege(college);

    }
    @PostMapping("/add Colleges")
   public List<College> addcolleges(@RequestBody List<College> colleges)
        {
            return service.addcollege(colleges);
        }

    @GetMapping("/get")
    public List<College> getallcollege()
            {
                return service.getallcollege();
            }
    @GetMapping("/get/{id}")
        public College getcollege(@PathVariable  String id)
            {
                return service.getcollege(id);
            }
   @DeleteMapping("/delete/{id}")
       public String deletecollege(@PathVariable String id)
           {
               return service.deletecollege(id);
           }
     @PutMapping("/update")
       public College updatecollege(@RequestBody College college)
           {
               return service.updatecollege(college);
           }



}
