package chapter04;

class TV2 {
	String name;
	int year;
	int inch;
	
	public TV2(String name, int year, int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}


public class TVTest {

	public static void main(String[] args) {

		TV myTV = new TV("LG", 2021, 32);
		myTV.show();
		
		TV2 my2 = new TV2("LG", 2021, 48);
		my2.show();
	}

}
