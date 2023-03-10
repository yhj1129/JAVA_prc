package ch8_practice;

import java.util.Scanner;

public class OrderTest{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주문 번호를 입력하세요");
		String orderNumber = scanner.next();
		System.out.println("주문 휴대폰 번호를 입력하세요");
		String orderPhoneNumber = scanner.next();
		System.out.println("주문 주소를 입력하세요");
		String orderAddress = scanner.next();
		System.out.println("주문 날짜를 입력하세요");
		String orderDate = scanner.next();
		System.out.println("주문 시간을 입력하세요");
		String orderTime = scanner.next();
		System.out.println("주문 가격을 입력하세요");
		String orderPrice = scanner.next();
		System.out.println("주문 메뉴 번호를 입력하세요");
		String orderMenu = scanner.next();
		
		Order order = new Order(orderNumber, orderPhoneNumber, orderAddress, orderDate, orderTime, orderPrice, orderMenu);
		
		System.out.println(order.ShowOrderInfo());	
	}
}
