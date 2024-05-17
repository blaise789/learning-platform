package com.java_project.learningplatform;

import com.java_project.learningplatform.daos.StudentDao;
import com.java_project.learningplatform.daos.TeacherDao;
import com.java_project.learningplatform.entities.*;
import com.java_project.learningplatform.utility.HibernateUtil;
import org.hibernate.SessionFactory;

import java.util.List;

public class LearningPlatformApplication {

	public static void main(String[] args) {

//
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		StudentDao studentDao=new StudentDao(sessionFactory);
////
//		Student student1=new Student();
//
//		ProgrammingCourse programmingCourse=new ProgrammingCourse();
//		CourseMaterial courseMaterial1=new CourseMaterial();
//		courseMaterial1.setUrl("www.coursera.com");
//		courseMaterial1.setCourse(programmingCourse);
//		programmingCourse.setTitle("Spring boot  full backend mastery");
//		programmingCourse.setCourseMaterial(courseMaterial1);
//		programmingCourse.setStudent(student1);
//		programmingCourse.setCourseMaterial(courseMaterial1);
//		programmingCourse.setCredit(1000);
//
////		science course
//		ScienceCourse scienceCourse=new ScienceCourse();
//		CourseMaterial courseMaterial2=new CourseMaterial();
//		courseMaterial2.setCourse(scienceCourse);
//		courseMaterial2.setUrl("mathisFun.com");
//		scienceCourse.setTitle("integrals");
//		scienceCourse.setCourseMaterial(courseMaterial2);
//		scienceCourse.setCredit(2000);
//		scienceCourse.setStudent(student1);
//		Names student1Names=new Names("bigirabagabo","blaise");
//
//		student1.setNames(student1Names);
//		student1.setEmail("blaise@gmail.com");
//		student1.setCourses(List.of(programmingCourse,scienceCourse));
//		student2
		Student student2=new Student();

		ProgrammingCourse programmingCourse2=new ProgrammingCourse();
		CourseMaterial courseMaterial3=new CourseMaterial();
		courseMaterial3.setUrl("www.gophers.com");
		courseMaterial3.setCourse(programmingCourse2);
		programmingCourse2.setTitle("golang  full backend mastery");
		programmingCourse2.setStudent(student2);
		programmingCourse2.setCourseMaterial(courseMaterial3);
		programmingCourse2.setCredit(4000);

//		science course
		ScienceCourse scienceCourse2=new ScienceCourse();
		CourseMaterial courseMaterial4=new CourseMaterial();
		courseMaterial4.setCourse(scienceCourse2);
		courseMaterial4.setUrl("symbolab.com");
		scienceCourse2.setTitle("derivatives");
		scienceCourse2.setCourseMaterial(courseMaterial4);
		scienceCourse2.setCredit(5000);
		scienceCourse2.setStudent(student2);
		Names student2Names=new Names("nduwayo","nathan");
		student2.setNames(student2Names);
		student2.setEmail("nathan@gmail.com");
		student2.setCourses(List.of(programmingCourse2,scienceCourse2));
//		studentDao.createStudent(student2);
//		studentDao.findStudent(1L);
//		List<Student> students=studentDao.findAllStudents();
//		for(Student std:students ){
//			System.out.println("student "+std.getStudentId()+" "+std.getNames()+" "+"student email is:"+std.getEmail());
//			System.out.println("the following courses are taken by"+std.getNames());
//			for(Course c:std.getCourses()){
//				System.out.println("  ->"+c.getTitle());
//			}
//		}
//		Names updatedNames=new Names("blaise","patience");
//		String email="bigirabagaboblaise@gmail.com";
//		studentDao.updateStudent(updatedNames,email,1L);
//		studentDao.deleteStudent(1L);


		TeacherDao teacherDao=new TeacherDao(sessionFactory);


	}

}
