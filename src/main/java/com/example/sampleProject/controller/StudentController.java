package com.example.sampleProject.controller;

import com.example.sampleProject.entity.Student;
import com.example.sampleProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student AddStudent(@RequestBody Student student) {
        return studentService.SaveStudent(student);
    }

    @GetMapping("/getStudents")
    public List<Student> getStudent() {
        return studentService.GetAllStudents();
    }

    @GetMapping("/getById/{id}")
    public Student GetByIdStudent(@PathVariable("id") int id) {
        return studentService.GetByIdStudent(id);
    }

    @PutMapping("/updateStudent/{id}")
    public Student UpdateStudent (@RequestBody Student student,@PathVariable("id") int id) {
        return studentService.UpdateStudent(student,id);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String DeleteStudent(@PathVariable("id") int id) {
        studentService.DeleteStident(id);
        return "Sussessfully deleted";
    }

}
