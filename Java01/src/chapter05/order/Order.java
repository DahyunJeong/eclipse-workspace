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
		System.out.println("�ֹ� ��ȣ: " + number);
		System.out.println("�ֹ��� ���̵�: " + id);
		System.out.println("�ֹ� ��¥: " + day);
		System.out.println("�ֹ��� �̸�: " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + product);
		System.out.println("��� �ּ�: " + address);
	}
}
