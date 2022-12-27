package ch14;
public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
//        Calc calc = new CompleteCalc(); // Calc 인터페이스에서 정의된 메서드만 사용 가능
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));

        calc.description();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
    }
}
