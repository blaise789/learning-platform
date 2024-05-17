package com.java_project.learningplatform.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Science_Course")
public class ScienceCourse  extends  Course{
}
