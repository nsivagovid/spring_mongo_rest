package com.example.spring_mongo_curd.service;



import com.example.spring_mongo_curd.model.Student;
import com.example.spring_mongo_curd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get student by ID
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    // Create a new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Update an existing student
    public Optional<Student> updateStudent(String id, Student studentDetails) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            Student studentToUpdate = student.get();
            studentToUpdate.setName(studentDetails.getName());
            studentToUpdate.setDepartment(studentDetails.getDepartment());
            studentToUpdate.setCourses(studentDetails.getCourses());
            studentRepository.save(studentToUpdate);
            return Optional.of(studentToUpdate);
        }
        return Optional.empty();
    }

    // Delete a student
    public boolean deleteStudent(String id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
            return true;
        }
        return false;
    }
}
