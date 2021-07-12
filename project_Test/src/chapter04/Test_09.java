package chapter04;

import java.util.Scanner;

public class Test_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.print("무슨 커피 드릴까요(에스프레소, 카푸치노, 카페라떼, 아메리카노)? ");
		String order = sc.next();
		
		switch(order) {
		case "에스프레소": case "카푸치노": case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
			default:
				System.out.println("메뉴에 없습니다.");
		}
		if(price != 0)
			System.out.println(order + "는 " + price +"원입니다.");
		
		sc.close();
	}

}
