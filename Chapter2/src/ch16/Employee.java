package ch16;

public class Employee {
    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String department;

    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        int num = 1;  //지역변수는 상관 없고
//        employeeName = "유현주"; 인스턴스 변수는 사용 불가 
        return serialNum;  //static 변수
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
