package ch6;

public class StudentTest {

	public static void main(String[] args) {

		Student studentYoo = new Student();
		
		System.out.println(studentYoo.showStudentInfo());
		//아무것도 안 넣으면 초기화된 값을 넣음 null, 0으로
		
		Student studentKim = new Student(123, "kim", 2);
		
		System.out.println(studentKim.showStudentInfo());
	}

}
