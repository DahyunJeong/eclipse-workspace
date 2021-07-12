package chapter05.order;

import java.util.Scanner;

public class Order_Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		
		System.out.print("주문 번호: ");
		order.number = sc.nextLong();
		System.out.print("주문자 아이디: ");
		order.id = sc.next();
		System.out.print("주문 날짜: ");
		order.year = sc.nextInt();
	//	System.out.print("년 ");
		order.mm = sc.nextInt();
	//	System.out.print("월 ");
		order.dd = sc.nextInt();
	//	System.out.println("일");
		
		System.out.print("주문자 이름: ");
		order.name = sc.next();
		System.out.print("주문 상품 번호: ");
		order.product = sc.next();
		System.out.print("배송 주소: ");
		order.address = sc.nextLine();
		
		System.out.println("주문 날짜: " + order.year + "년 " + order.mm + "월 " + order.dd +"일");
		System.out.println("배송 주소: " + order.address);
		
		sc.close();
	}

}
