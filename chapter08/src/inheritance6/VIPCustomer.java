package inheritance6;

public class VIPCustomer extends Customer{
	private int agentID;			//VIP ���� ���� ID
//	double saleRatio;				//VIP ������
	
	public VIPCustomer() {			//VIP
		//super(); 					//��ӹ޾ұ� ������ super�� �ְ� ������ ����, ����Ŭ������ ��ü�� ���� �������
		customerGrade = "VIP";
		bonusRatio = 0.05;			//���ʽ� ����Ʈ �⺻ ���� ���� 5%
		saleRatio = 0.1;			//������ 10%
	}
	
	public int getAgentID() {					//VIP�������Ը� �ʿ��� �޼���
		return agentID;
	}
	
}