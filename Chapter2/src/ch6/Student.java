package ch6;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		
	}
	
	public Student(int studentNumber, String studentName, int grage) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grage;
	}
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년입니다.";
	}
}
