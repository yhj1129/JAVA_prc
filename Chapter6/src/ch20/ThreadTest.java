package src.ch20;

class MyThread implements Runnable { //다른걸 extends한 경우 Runnable을 implements 한다
    //run
    public void run() {
        int i;
        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //스레드 1 : 메인 스레드는 스레드 두개 생성하고 스타트하면 끝
        System.out.println(Thread.currentThread() + " start");
        MyThread runnable = new MyThread();
        Thread th1 = new Thread(runnable); // runnable객체를 입력받을 수 있다
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread() + " end");

        Runnable run = new Runnable() { //바로 익명 객체를 불러올 수 있다 - 메서드 구현해야함

            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }
}
