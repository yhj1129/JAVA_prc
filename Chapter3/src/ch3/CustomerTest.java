package ch3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");

        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerYoo = new VIPCustomer(10020, "유현주");

        customerYoo.bonusPoint = 10000;
        System.out.println(customerYoo.showCustomerInfo());

    }
}
