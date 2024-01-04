package com.example.sampleProject.controller;

import com.example.sampleProject.entity.University;
import com.example.sampleProject.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @PostMapping("/addUniversity")
    public University AddUniversity(@RequestBody University university){
        return universityService.SaveUniversity(university);
    }
}
