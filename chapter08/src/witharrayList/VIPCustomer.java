package witharrayList;

public class VIPCustomer extends Customer{
	
	private int agentID;			//VIP 고객 상담원 ID
	double saleRatio;				//VIP 할인율(물품 가격 할인 비율)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {	//VIP
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;			//보너스 포인트 기본 적립 비율 5%
		saleRatio = 0.1;			//할인율 10%
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {					//VIP고객에게만 필요한 메서드
		return agentID;
	}
	
}
