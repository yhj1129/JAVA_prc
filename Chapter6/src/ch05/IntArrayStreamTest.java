package src.ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int num : arr){
            System.out.println(num);
        }
        System.out.println();
        Arrays.stream(arr).forEach(n -> System.out.println(n));

        IntStream is = Arrays.stream(arr); // IntStream을 반환함
        // Stream에 있는 메서드들은 자료형에 관계 없이 대부분 똑같음
        is.forEach(n -> System.out.println(n)); //위에서 생성한 is로 연산을 한 번 하면
        //is. 다시 못한다. 소모 되었다. 또 생성해야 한다.

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
