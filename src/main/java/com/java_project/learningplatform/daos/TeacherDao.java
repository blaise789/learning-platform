package com.java_project.learningplatform.daos;

import org.hibernate.SessionFactory;

public class TeacherDao {
    private SessionFactory sessionFactory;

    public TeacherDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
