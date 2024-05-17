package com.java_project.learningplatform.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Programing_Course")
public class ProgrammingCourse extends  Course{

}
