package ch11;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc ccalc = new CompleteCalc();
//        Calc calc = new CompleteCalc(); // Calc 인터페이스에서 정의된 메서드만 사용 가능
        System.out.println(ccalc.add(num1,num2));
        System.out.println(ccalc.substract(num1,num2));
        System.out.println(ccalc.times(num1,num2));
        System.out.println(ccalc.divide(num1,num2));

        ccalc.showInfo();
    }
}
