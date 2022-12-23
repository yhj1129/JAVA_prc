package ch4;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010,"이순신");
        int price = customerLee.calcPrice(1000);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerYoo = new VIPCustomer(10020, "유현주");

        price = customerYoo.calcPrice(1000);
        customerYoo.bonusPoint = 10000;
        System.out.println(customerYoo.showCustomerInfo() + price);

        Customer vc = new VIPCustomer(12345, "vip");

        System.out.println(vc.calcPrice(1000));
    }
}
