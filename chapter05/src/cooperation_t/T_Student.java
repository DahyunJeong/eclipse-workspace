package cooperation_t;

public class T_Student {
	
	String name;
	int money;
	//T_Bus bBus;
	//T_Subway sSubway;
	
	public T_Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void BusRide(T_Bus bus) {
		money -= 1000;
		bus.busRide();
	}
	
	public void SubwayRide(T_Subway subway) {
		money -= 1500;
		subway.subwayRide();
	}
	
	public void showStudentInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원입니다.");
	}

}
