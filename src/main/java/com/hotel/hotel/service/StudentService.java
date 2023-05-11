package com.hotel.hotel.service;

import com.hotel.hotel.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student("Aleksandr", "Homets", 22));
        students.add(new Student("SomeOne", "else", 23));
    }

    public List<Student> getAllStudents() {
        return students;
    }
}