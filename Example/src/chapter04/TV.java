package chapter04;

public class TV {
	String name;
	int year;
	int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(name + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}
