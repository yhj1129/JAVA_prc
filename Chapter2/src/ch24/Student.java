package ch24;

import java.util.ArrayList;

public class Student {

    public int studentID;
    public String studentName;

    ArrayList<Subject> subjectList;
    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject subject : subjectList) {
            total += subject.getScorePoint();
            System.out.println(studentName + "학생의 " + studentName + " 과목의 성적은 " + subject.getScorePoint() + " 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}
