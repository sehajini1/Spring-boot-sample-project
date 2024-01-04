package com.example.sampleProject.service;

import com.example.sampleProject.entity.Student;
import com.example.sampleProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student SaveStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }

    public Student GetByIdStudent(int id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    public Student UpdateStudent(Student student, int id) {
        Student student1 = studentRepository.findById(id).get();

        if(Objects.nonNull(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())) {
            student1.setFirstName(student.getFirstName());
        }
        if(Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
            student1.setLastName(student.getLastName());
        }
        if(Objects.nonNull(student.getCity()) && !"".equalsIgnoreCase(student.getCity())) {
            student1.setCity(student.getCity());
        }
        return studentRepository.save(student1);
    }

    public void DeleteStident(int id) {
        studentRepository.deleteById(id);
    }
}
