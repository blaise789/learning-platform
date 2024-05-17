package com.java_project.learningplatform.daos;

import com.java_project.learningplatform.entities.Names;
import com.java_project.learningplatform.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {
    private  SessionFactory sessionFactory;
    public StudentDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void createStudent(Student student){
        try {
            Session session=sessionFactory.openSession();
            Transaction tx = session.beginTransaction();
            session.persist(student);
            tx.commit();

        }
        catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }
    public void findStudent(Long id){
        try{
            Session session=sessionFactory.openSession();
            Transaction tx=session.beginTransaction();
            Student student=session.get(Student.class,id);
            System.out.println(student.getNames());
            System.out.println(student.getEmail());
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
    public List<Student> findAllStudents(){
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM students", Student.class).list();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }

    }

    public void updateStudent(Names names,String email, Long id){

        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Student studentToUpdate=session.get(Student.class,id);
        studentToUpdate.setNames(names);
        studentToUpdate.setEmail(email);
        session.merge(studentToUpdate);
        tx.commit();

    }
    public void deleteStudent(Long id){
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Student studentToDelete=session.get(Student.class,id);
        session.remove(studentToDelete);
        tx.commit();
    }
}
