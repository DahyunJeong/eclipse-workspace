package chapter04;

import java.util.Scanner;

public class Test_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int price = 0;
		
		System.out.print("���� Ŀ�� �帱���(����������, īǪġ��, ī���, �Ƹ޸�ī��)? ");
		String order = sc.next();
		
		switch(order) {
		case "����������": case "īǪġ��": case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
			default:
				System.out.println("�޴��� �����ϴ�.");
		}
		if(price != 0)
			System.out.println(order + "�� " + price +"���Դϴ�.");
		
		sc.close();
	}

}
