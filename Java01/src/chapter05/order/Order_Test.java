package chapter05.order;
import chapter05.order.Order;


public class Order_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order();
		
		order.number = 201803120001L;	//Long���̶� �ڿ� L/l �־�� ��
		order.id = "abc123";
		order.day = "2018�� 3�� 12��"; 
		order.name = "ȫ���";
		order.product = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		order.orderViews();
		
		
	}

}

		/*
		System.out.print("�ֹ� ��ȣ: ");
		order.number = sc.nextInt();
		System.out.print("�ֹ��� ���̵�: ");
		order.id = sc.next();
		System.out.print("�ֹ� ��¥: ");
		order.year = sc.nextInt();
		System.out.print("�� ");
		order.month = sc.nextInt();
		System.out.print("�� ");
		order.day = sc.nextInt();
		System.out.println("��");
		
		System.out.print("�ֹ��� �̸�: ");
		order.name = sc.next();
		System.out.println("�ֹ� ��ǰ ��ȣ");
		*/
		