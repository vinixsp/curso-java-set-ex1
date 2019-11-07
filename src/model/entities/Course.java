package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private String name;
	private Teacher teacher;
	
	private Set<Student> students = new HashSet<Student>();

	public Course(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}

}
