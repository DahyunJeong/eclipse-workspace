package cooperation_t;

public class T_Subway {

	int person;
	int won;
	String subwayName;
	
	public T_Subway(String subwayName) {
		this.subwayName = subwayName;
	}
	
	public void subwayRide() {
		person++;
		won += 1500;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayName + "�� �°��� " + person + "���̰�, ������ " + won + "���Դϴ�.");
	}
}
