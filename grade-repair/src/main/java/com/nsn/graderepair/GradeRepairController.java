package com.nsn.graderepair;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeRepairController {
    @GetMapping("/grepair")
    public String RepairController(){
        return "repair.html";
    }

    
}
