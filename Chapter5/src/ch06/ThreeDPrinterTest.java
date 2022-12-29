package ch06;

public class ThreeDPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer3 = new ThreeDPrinter3();

        printer3.setMaterial(powder);

        Powder p = (Powder) printer3.getMaterial(); //반환이 Object 타입으로 되기 때문에 Powder로 형변환을 해야함
    }
}
