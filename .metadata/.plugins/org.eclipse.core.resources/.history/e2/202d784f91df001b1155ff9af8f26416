package inheritance6;

public class VIPCustomer extends Customer{
	private int agentID;			//VIP 고객 상담원 ID
//	double saleRatio;				//VIP 할인율
	
	public VIPCustomer() {			//VIP
		//super(); 					//상속받았기 때문에 super가 있고 생략돼 있음, 상위클래스의 객체가 먼저 만들어짐
		customerGrade = "VIP";
		bonusRatio = 0.05;			//보너스 포인트 기본 적립 비율 5%
		saleRatio = 0.1;			//할인율 10%
	}
	
	public int getAgentID() {					//VIP고객에게만 필요한 메서드
		return agentID;
	}
	
}
