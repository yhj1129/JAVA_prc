package ch8_practice;

public class Order {
	
	public String orderNumber;
	public String orderPhoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String orderMenu;
	
	public Order(String orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, String orderTime, String orderPrice, String orderMenu) {
		this.orderNumber = orderNumber;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderMenu = orderMenu;
	}
	
	public String ShowOrderInfo() {
		return "주문 접수 번호 : " + orderNumber + "\n" +
				"주문 핸드폰 번호 : " + orderPhoneNumber + "\n" +
				"주문 집 주소 : " + orderAddress + "\n" +
				"주문 날짜 : " + orderDate + "\n" +
				"주문 시간 : " + orderTime + "\n" +
				"주문 가격 : " + orderPrice + "\n" +
				"메뉴 번호 : " + orderMenu + "\n" ;
	}
}
