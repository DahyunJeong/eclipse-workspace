package inheritance6;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("���� ������ 50000��, ����� �ݾ���: " + customerLee.calcPrice(50000));
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("���� ������ 50000��, ����� �ݾ���: " + customerKim.calcPrice(50000));

		
	}

}