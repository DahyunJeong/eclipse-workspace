package chapter05.order;

public class Order {

	long number;
	String id;
	String day;
	String name;
	String product;
	String address;
	
	int year;
	int mm;
	int dd;
	
	public void orderViews() {
		System.out.println("주문 번호: " + number);
		System.out.println("주문자 아이디: " + id);
		System.out.println("주문 날짜: " + day);
		System.out.println("주문자 이름: " + name);
		System.out.println("주문 상품 번호: " + product);
		System.out.println("배송 주소: " + address);
	}
}
