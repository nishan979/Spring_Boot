package com.nsn.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GradeController {

    List<Grade> studentGrades = new ArrayList<>();   

    @GetMapping("/")
    public String gradeForm(Model model, @RequestParam(required = false) String name) {
        System.out.println(name);
        Grade grade = new Grade();
        model.addAttribute("grade", new Grade());
        return "form";
    }
    
    @PostMapping("/handleSubmit")
    public String submitGrade(Grade grade) {
        studentGrades.add(grade);
        
        return "redirect:/grades";
    }
    



    @GetMapping("/grades")
    public String getGrades(Model model){
       
        model.addAttribute("grades", studentGrades);
        return "grades";
    }

    public Integer getGradeIndex(String name) {
        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i).getName().equals(name)) {
                return i;
            }
        }
        return null;
    }
}
