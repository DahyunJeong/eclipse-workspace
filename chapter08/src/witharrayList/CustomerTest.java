package witharrayList;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>(); // ����, ��ü�� ������ ���� �迭

		// ��ü �����
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿"); // ��ĳ����
		Customer customerYul = new GoldCustomer(10040, "������"); // ��ĳ����
		Customer customerKim = new VIPCustomer(10050, "������", 12345); // ��ĳ����

		// ��ü ArrayList�� ���!
		customerList.add(customerLee); // �ε��� 0���濡 ����
		customerList.add(customerShin); // �ε��� 1���濡 ����
		customerList.add(customerHong); // �ε��� 2���濡 ����
		customerList.add(customerYul); // �ε��� 3���濡 ����
		customerList.add(customerKim); // �ε��� 4���濡 ����

		System.out.println("=====���� ���� ���=====");
		for (Customer cus : customerList) {
			System.out.println(cus.showCustomerInfo());
		}

		System.out.println("=====�������� ���ʽ� ����Ʈ ���=====");
		int price = 10000;
		for (Customer cus : customerList) {
			int cost = cus.calcPrice(price);	//�������̵��� �ֵ� �θ� ���� ����
			System.out.println(cus.getCustomerName() + " ���� " + cost + " �� �����ϼ̽��ϴ�.");
			System.out.println(cus.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " 
								+ cus.bonusPoint + "���Դϴ�.");
		}

		
	}

}