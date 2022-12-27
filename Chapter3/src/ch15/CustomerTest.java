package ch15;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer; //업캐스팅
        buyer.buy();
        buyer.order(); //재정의된 메서드 호출됨

        Sell seller = customer;
        seller.sell();
        seller.order(); //재정의된 메서드 호출됨
    }
}
