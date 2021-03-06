package witharrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>(); // 선언, 객체형 데이터 담은 배열

		// 객체 만들기
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동"); // 업캐스팅
		Customer customerYul = new GoldCustomer(10040, "이율곡"); // 업캐스팅
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345); // 업캐스팅

		// 객체 ArrayList에 담기!
		customerList.add(customerLee); // 인덱스 0번방에 저장
		customerList.add(customerShin); // 인덱스 1번방에 저장
		customerList.add(customerHong); // 인덱스 2번방에 저장
		customerList.add(customerYul); // 인덱스 3번방에 저장
		customerList.add(customerKim); // 인덱스 4번방에 저장

		System.out.println("=====고객 정보 출력=====");
		for (Customer cus : customerList) {
			System.out.println(cus.showCustomerInfo());
		}

		System.out.println("=====할인율과 보너스 포인트 계산=====");
		int price = 10000;
		for (Customer cus : customerList) {
			int cost = cus.calcPrice(price);	//오버라이딩된 애들 부를 수도 있음
			System.out.println(cus.getCustomerName() + " 님이 " + cost + " 원 지불하셨습니다.");
			System.out.println(cus.getCustomerName() + " 님의 현재 보너스 포인트는 " 
								+ cus.bonusPoint + "점입니다.");
		}

		
	}

}
