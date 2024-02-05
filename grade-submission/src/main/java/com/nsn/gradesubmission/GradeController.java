package com.nsn.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class GradeController {
    
    @RequestMapping("/grades")
    @GetMapping
    public String getGrades(Model model){
        Grade grade = new Grade("Nishat", "Biology", "A+");
        model.addAttribute("grade", grade);
        return "grades";
    }
}
