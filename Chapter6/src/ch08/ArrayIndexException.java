package src.ch08;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i<= 5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println("here!"); //여기까지 출력 잘 됨
    }
}
