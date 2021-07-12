package chapter05.order;
import chapter05.order.Order;


public class Order_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order();
		
		order.number = 201803120001L;	//Long형이라 뒤에 L/l 넣어야 함
		order.id = "abc123";
		order.day = "2018년 3월 12일"; 
		order.name = "홍길순";
		order.product = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.orderViews();
		
		
	}

}

		/*
		System.out.print("주문 번호: ");
		order.number = sc.nextInt();
		System.out.print("주문자 아이디: ");
		order.id = sc.next();
		System.out.print("주문 날짜: ");
		order.year = sc.nextInt();
		System.out.print("년 ");
		order.month = sc.nextInt();
		System.out.print("월 ");
		order.day = sc.nextInt();
		System.out.println("일");
		
		System.out.print("주문자 이름: ");
		order.name = sc.next();
		System.out.println("주문 상품 번호");
		*/
		