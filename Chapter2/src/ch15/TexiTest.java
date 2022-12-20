package ch15;

public class TexiTest {
    public static void main(String[] args) {
        Student studentE = new Student("Edward", 20000);
        Texi texi = new Texi("잘 나간다 운수");

        studentE.takeTexi(texi);

        studentE.showInfo();
        texi.showTexiInfo();
    }
}
