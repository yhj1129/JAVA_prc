package ch15;

public class Texi {
    String texiName;
    int money;

    public Texi(String texiName){
        this.texiName = texiName;

    }

    public void take(int money){
        this.money += money;
    }

    public void showTexiInfo(){
        System.out.println(texiName + "택시 수입은 " + money + "원 입니다.");
    }
}
