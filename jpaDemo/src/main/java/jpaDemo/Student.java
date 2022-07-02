package jpaDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int studentId;
	private String name;
	private String subjectName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectName() {
		return subjectName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", subjectName=" + subjectName + "]";
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
