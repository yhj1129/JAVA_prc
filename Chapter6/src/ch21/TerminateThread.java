package src.ch21;

import java.io.IOException;

public class TerminateThread extends Thread{

    private boolean flag = false;
    int i;

    public TerminateThread(String name){
        super(name);
    }

    public void run(){


        while(!flag){ //while(true)로 두지 말고 플래그를 이용해서 수정할 수 있다
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println( getName() + " end" );

    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }


    public static void main(String[] args) throws IOException {

        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        TerminateThread threadC = new TerminateThread("C");

        threadA.start();
        threadB.start();
        threadC.start();

        int in;
        while(true){
            in = System.in.read();
            if ( in == 'A'){
                threadA.setFlag(true); //a 스레드 종료
            }else if(in == 'B'){
                threadB.setFlag(true); //b 스레드 종료
            }else if( in == 'C'){
                threadC.setFlag(true); //c 스레드 종료
            }else if( in == 'M'){
                threadA.setFlag(true); //모든 스레드 종료
                threadB.setFlag(true);
                threadC.setFlag(true);
                break;
            }else{
                System.out.println("type again");
            }
        }

        System.out.println("main end");

    }
}
