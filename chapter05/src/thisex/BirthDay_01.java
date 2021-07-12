package thisex;

public class BirthDay_01 {

	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);			
		System.out.println(bDay);	//bDay 객체의 RAM의 힙주소 출력: thisex.BirthDay@7de26db8
		bDay.printThis();	//bDay가 가리키는 힙메모리 주소: thisex.BirthDay@7de26db8
							//둘이 가리키는 주소가 똑같음! 메모리의 힙영역에 저장되는 JVM이 만드는 주소
		
	}
}
