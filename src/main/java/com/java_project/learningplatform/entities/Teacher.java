package com.java_project.learningplatform.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacher_id;
    private Names names;
    @ManyToMany()
    @JoinTable(name = "t_courses")
    public  List<Course> courses;
    @ManyToMany()
    @JoinTable(name="t_students")
    public  List<Student> students;


}
