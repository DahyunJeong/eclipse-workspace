package witharrayList;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "�̼���");
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("���� ������ 50000��, ����� �ݾ���: " + customerLee.calcPrice(50000) +
				" ����Ʈ: " + customerLee.bonusPoint);
		
		GoldCustomer customerJeong = new GoldCustomer(10020, "�����");
//		customerJeong.setCustomerID(10020);
//		customerJeong.setCustomerName("�����");
		customerJeong.bonusPoint = 5000;
		System.out.println(customerJeong.showCustomerInfo());
		System.out.println("���� ������ 50000��, ����� �ݾ���: " + customerJeong.calcPrice(50000) +
		" ����Ʈ: " + customerJeong.bonusPoint);
		
		VIPCustomer customerKim = new VIPCustomer(10030, "������", 123);
//		customerKim.setCustomerID(10030);
//		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("���� ������ 50000��, ����� �ݾ���: " + 
		customerKim.calcPrice(50000) + " ����Ʈ: " + customerKim.bonusPoint);

		
	}

}
