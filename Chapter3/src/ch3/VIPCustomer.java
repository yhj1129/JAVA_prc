package ch3;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

//    public VIPCustomer(){
//        super(0,null);
//        //슈퍼 키워드는 하위클래스가 상위 클래스의 참조값을 갖게함, 안써도 됨 자동으로 됨, 즉 컴파일러가 default constructor로 생성함
//        //근데 default 생성자가 없을 경우? 직접 생성해야함
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }
    public int getAgentID(){
        return agentID;
    }

}
