package ch9;

public abstract class NoteBook extends Computer{
    @Override
    public void display() {
        System.out.println("NoteBook display");
    }
    //상위에서 추상 메서드를 모두 상속하지 않으면 그 클래스는 추상 클래스가 된다
}
