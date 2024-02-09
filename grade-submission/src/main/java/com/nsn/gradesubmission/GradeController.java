package com.nsn.gradesubmission;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class GradeController {

    List<Grade> studentGrades = Arrays.asList(
        (new Grade("Rocky", "Biology", "A+")),
        (new Grade("Pinky", "Chemistry", "B+")),
        (new Grade("Roy", "English", "A-"))
    );
    // List<Grade> studentGrades = new ArrayList<>();

    @RequestMapping("/grades")
    @GetMapping
    public String getGrades(Model model){
       
        // studentGrades.add(new Grade("Rocky", "Biology", "A+"));
        // studentGrades.add(new Grade("Pinky", "Chemistry", "B+"));
        // studentGrades.add(new Grade("Roy", "English", "A-"));
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
