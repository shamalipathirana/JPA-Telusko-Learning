package jpaDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")  
public class StudentDetails {

	@Id
	@Column(name="student_id")
	private int studentId;
	private String name;
	@Column(name="subject_name")
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
