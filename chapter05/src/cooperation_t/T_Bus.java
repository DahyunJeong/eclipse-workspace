package cooperation_t;

public class T_Bus {

	int person;
	int won;
	String busName;
	
	public T_Bus(String busName) {
		this.busName = busName;
	}
	
	public void busRide() {
		person++;
		won += 1000;
	}
	
	public void showBusInfo() {
		System.out.println(busName + "�� �°��� " + person + "���̰�, ������ " + won + "���Դϴ�.");
	}
	
}
