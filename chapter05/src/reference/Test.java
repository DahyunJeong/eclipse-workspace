package reference;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student4 studentLee = new Student4(123, "Lee");
		studentLee.setKorean("����", 70);
		studentLee.setMath("����", 80);
		
		Student4 studentKim = new Student4(124, "Kim");
		studentKim.setKorean("����", 100);
		studentKim.setMath("����", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
