package com.java_project.learningplatform.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private Names names;
    private String email;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch =FetchType.EAGER)

    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getNames() {
        return  names.getFirstName()+" "+names.getLastName();
    }

    public void setNames(Names names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Student " + "names are " + names+" and the student email";
    }
}
