package inheritance6;


public class VIPCustomerOLD {	//상속 쓰지 않았을 때
	private int customerID;
	private String customerName;
	private String customerGrade;	//고객 등급
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;			//VIP 고객 상담원 ID
	double saleRatio;				//VIP 할인율
	
	public VIPCustomerOLD() {			//VIP
		customerGrade = "VIP";
		bonusRatio = 0.05;			//보너스 포인트 기본 적립 비율 5%
		saleRatio = 0.1;			//할인율 10%
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);	//할인율 적용
	}
	public int getAgentID() {					//VIP고객에게만 필요한 메서드
		return agentID;
	}
	
	public String showVIPCustomerOLDInfo() {
		return customerName + " 님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint +"입니다.";
	}
}
