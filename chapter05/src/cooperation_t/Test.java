package cooperation_t;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T_Bus bus100 = new T_Bus("100�� ����");
		T_Bus bus200 = new T_Bus("200�� ����");
		T_Bus bus300 = new T_Bus("300�� ����");
		
		T_Subway sub1 = new T_Subway("1ȣ��");
		T_Subway sub2 = new T_Subway("2ȣ��");

		
		T_Student lee = new T_Student("�̶���", 10000);
		lee.BusRide(bus100);
		lee.BusRide(bus100);
		lee.showStudentInfo();
		
		
		T_Student kim = new T_Student("�趯��", 50000);
		kim.BusRide(bus300);
		kim.SubwayRide(sub1);
		kim.showStudentInfo();
		
		System.out.println();
		bus100.showBusInfo();
		bus200.showBusInfo();
		bus300.showBusInfo();
		System.out.println();
		sub1.showSubwayInfo();
		sub2.showSubwayInfo();
	}

}
