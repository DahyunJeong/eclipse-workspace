package witharrayList;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;	//���� ���
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();				//������ �ʱ�ȭ..?
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID; 
		this.customerName = customerName;
		
		initCustomer();				//�ʱ�ȭ ��Ű�� ��
	}
	
	public void initCustomer() {	//�⺻ ������� �ʱ�ȭ
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {		//����Ʈ ����, ���� ����
		bonusPoint += price * bonusRatio;	
		return price;
	}
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + 
				"�̸�, ���ʽ� ����Ʈ�� " + bonusPoint +"�Դϴ�.";
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