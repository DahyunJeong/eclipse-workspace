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
		System.out.println(bDay);	//bDay ��ü�� RAM�� ���ּ� ���: thisex.BirthDay@7de26db8
		bDay.printThis();	//bDay�� ����Ű�� ���޸� �ּ�: thisex.BirthDay@7de26db8
							//���� ����Ű�� �ּҰ� �Ȱ���! �޸��� �������� ����Ǵ� JVM�� ����� �ּ�
		
	}
}
