package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entities.Course;
import model.entities.Student;
import model.entities.Teacher;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Teacher teacher = new Teacher("Alex");
		
		List<Course> courses = new ArrayList<>();
		
		courses.add(new Course("A", teacher));
		courses.add(new Course("B", teacher));
		courses.add(new Course("C", teacher));
		
		for (Course c : courses) {
			System.out.print("How many students for course " + c.getName() + "? ");
			
			int n = sc.nextInt();
			
			for (int i=1;i<=n;i++) {
				System.out.print("Código do aluno " + i + ": ");
				int code = sc.nextInt();
				
				c.addStudent(new Student(code, "Aluno " + code, "aluno" + code + "@gmail.com"));
			}
			System.out.println();
		}
		
		Set<Student> students = new HashSet<>();
		for (Course c : courses) {
			if (c.getTeacher().getName() == "Alex") {
				students.addAll(c.getStudents());
			}
		}
		
		System.out.println("Total students: " + students.size());

		sc.close();
	}

}
