package ch6;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum = 127;
		System.out.println(bnum);
		
//		int num = 1234568789000;
		long lnum = 12345678900L;
		//long 했는데 숫자가 작으면 int에서 long으로 바뀜
		System.out.println(lnum);
	}

}
