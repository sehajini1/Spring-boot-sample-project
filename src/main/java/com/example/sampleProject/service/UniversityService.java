package com.example.sampleProject.service;

import com.example.sampleProject.entity.University;
import com.example.sampleProject.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
    @Autowired
    private UniversityRepository universityRepository;

    public University SaveUniversity(University university) {
        universityRepository.save(university);
        return university;
    }
}
