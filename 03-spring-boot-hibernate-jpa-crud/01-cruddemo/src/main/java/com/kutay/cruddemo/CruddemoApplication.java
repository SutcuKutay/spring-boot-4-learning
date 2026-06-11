package com.kutay.cruddemo;

import com.kutay.cruddemo.dao.StudentDAO;
import com.kutay.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students...");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);

	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 3;
		System.out.println("Deleting student id: " + studentId);

		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		int studentId = 1;
		Student myStudent = studentDAO.findById(studentId);
		// change first name to "Scooby"
		System.out.println("Updating student...");
		myStudent.setFirstName("Scooby");
		// update the student
		studentDAO.update(myStudent);
		// display the updated student
		System.out.println("Updated student: " + myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Duck");
		// display list of students
		for(Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student
		Student newStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");
		// save the student
		studentDAO.save(newStudent);
		// display id of the saved student
		int theId = newStudent.getId();
		// retrieve student based on the id: primary key
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		Student newStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student newStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student newStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		System.out.println("Saving the students...");

		studentDAO.save(newStudent1);
		studentDAO.save(newStudent2);
		studentDAO.save(newStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		Student newStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		studentDAO.save(newStudent);

		System.out.println("Saved student. Generated id: " + newStudent.getId());

	}


}
