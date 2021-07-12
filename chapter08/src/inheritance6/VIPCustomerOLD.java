package inheritance6;


public class VIPCustomerOLD {	//��� ���� �ʾ��� ��
	private int customerID;
	private String customerName;
	private String customerGrade;	//�� ���
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;			//VIP �� ���� ID
	double saleRatio;				//VIP ������
	
	public VIPCustomerOLD() {			//VIP
		customerGrade = "VIP";
		bonusRatio = 0.05;			//���ʽ� ����Ʈ �⺻ ���� ���� 5%
		saleRatio = 0.1;			//������ 10%
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);	//������ ����
	}
	public int getAgentID() {					//VIP�����Ը� �ʿ��� �޼���
		return agentID;
	}
	
	public String showVIPCustomerOLDInfo() {
		return customerName + " ���� ����� " + customerGrade + 
				"�̸�, ���ʽ� ����Ʈ�� " + bonusPoint +"�Դϴ�.";
	}
}
