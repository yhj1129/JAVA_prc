package ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeYoo = new Employee();
        employeeYoo.setEmployeeName("유현주");

        System.out.println(employeeYoo.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김현주");

        System.out.println(employeeYoo.getEmployeeName() + "님의 사번은 " + employeeYoo.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());

    }

}
