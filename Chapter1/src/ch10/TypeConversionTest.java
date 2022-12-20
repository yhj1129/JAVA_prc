package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
//		int iNum = 255;
//		byte bNum = (byte)iNum;
//		
//		System.out.println(bNum); // 이상한 값이 나온다
//		
//		double dNum = 3.14;
//		int inum = (int)dNum;
//		
//		System.out.println(inum);
		
		double dnum = 1.2;
		float fnum = 0.9f;
		
		int inum1 = (int)dnum + (int)fnum; //1과 0의 합이 됨
		int inum2 = (int)(dnum + fnum); //2.1이 먼저 되고 0.1 탈락
		
		System.out.println(inum1);
		System.out.println(inum2);
	}

}
