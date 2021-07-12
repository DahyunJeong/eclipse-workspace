package witharrayList;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("물건 가격은 50000원, 계산할 금액은: " + customerLee.calcPrice(50000) +
				" 포인트: " + customerLee.bonusPoint);
		
		GoldCustomer customerJeong = new GoldCustomer(10020, "정약용");
//		customerJeong.setCustomerID(10020);
//		customerJeong.setCustomerName("정약용");
		customerJeong.bonusPoint = 5000;
		System.out.println(customerJeong.showCustomerInfo());
		System.out.println("물건 가격은 50000원, 계산할 금액은: " + customerJeong.calcPrice(50000) +
		" 포인트: " + customerJeong.bonusPoint);
		
		VIPCustomer customerKim = new VIPCustomer(10030, "김유신", 123);
//		customerKim.setCustomerID(10030);
//		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("물건 가격은 50000원, 계산할 금액은: " + 
		customerKim.calcPrice(50000) + " 포인트: " + customerKim.bonusPoint);

		
	}

}
