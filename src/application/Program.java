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
		
		Teacher teacherAlex = new Teacher("Alex");
		Teacher teacherBob = new Teacher("Bob");
		
		List<Course> courses = new ArrayList<>();
		
		courses.add(new Course("A", teacherAlex));
		courses.add(new Course("B", teacherBob));
		courses.add(new Course("C", teacherAlex));
		
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
		
		// Filtrando apenas os cursos do professor Alex
		courses.removeIf(x -> x.getTeacher().getName() != "Alex");
		
		for (Course c : courses) {
			students.addAll(c.getStudents());
		}
		
		System.out.println("Total students: " + students.size());

		sc.close();
	}

}
