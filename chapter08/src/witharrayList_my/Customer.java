package witharrayList_my;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;	//고객 등급
	int bonusPoint;
	double bonusRatio;
	double saleRatio;				//할인율
	
	public Customer() {
		initCustomer();				//생성자 초기화..?
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID; 
		this.customerName = customerName;
		
		initCustomer();				//초기화 시키는 애
	}
	
	public void initCustomer() {	//기본 등급으로 초기화
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		saleRatio = 0;				// silver는 할인율 0
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);	//할인율 같이 계산한 값
	}
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint +"입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
