package ch2;

import java.util.Objects;

public class Student implements Cloneable{

    private int studentNum;



    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return  "studentNum=" + studentNum +
                ", studentName='" + studentName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            if (studentNum == student.studentNum) return true;
            else return false;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return studentNum;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
