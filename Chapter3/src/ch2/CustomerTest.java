package ch2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("유현주");
        customerLee.setCustomerID(1000);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerYoo = new VIPCustomer();
        customerYoo.setCustomerName("현주");
        customerYoo.setCustomerID(10002);
        customerYoo.bonusPoint = 10000;
        System.out.println(customerYoo.showCustomerInfo());
    }
}
