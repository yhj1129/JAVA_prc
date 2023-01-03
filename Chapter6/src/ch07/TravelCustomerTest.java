package src.ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("Lee", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("Kim", 20, 100);
        TravelCustomer customerYoo = new TravelCustomer("Yoo", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerYoo);

        System.out.println("고객 명단 출력");
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        //map에 getName으로 이름만 가져온 스트림 만들고(중간연산) 그 스트림을 forEach로 받는다(최종연산)

        System.out.println("여행비용");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("20세 이상 고객 이름 정렬");
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));


    }
}
