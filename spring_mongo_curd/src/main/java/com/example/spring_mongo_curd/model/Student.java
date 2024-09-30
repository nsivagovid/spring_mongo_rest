package com.example.spring_mongo_curd.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Students")
public class Student {

    @Id
    private String id;
    private String name;
    private String department;
    private List<Integer> courses;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String id, String name, String department, List<Integer> courses) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = courses;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Integer> getCourses() {
        return courses;
    }

    public void setCourses(List<Integer> courses) {
        this.courses = courses;
    }
}
