package chapter05.order;

import java.util.Scanner;

public class Order_Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		
		System.out.print("�ֹ� ��ȣ: ");
		order.number = sc.nextLong();
		System.out.print("�ֹ��� ���̵�: ");
		order.id = sc.next();
		System.out.print("�ֹ� ��¥: ");
		order.year = sc.nextInt();
	//	System.out.print("�� ");
		order.mm = sc.nextInt();
	//	System.out.print("�� ");
		order.dd = sc.nextInt();
	//	System.out.println("��");
		
		System.out.print("�ֹ��� �̸�: ");
		order.name = sc.next();
		System.out.print("�ֹ� ��ǰ ��ȣ: ");
		order.product = sc.next();
		System.out.print("��� �ּ�: ");
		order.address = sc.nextLine();
		
		System.out.println("�ֹ� ��¥: " + order.year + "�� " + order.mm + "�� " + order.dd +"��");
		System.out.println("��� �ּ�: " + order.address);
		
		sc.close();
	}

}
