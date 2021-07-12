package reference;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student4 studentLee = new Student4(123, "Lee");
		studentLee.setKorean("국어", 70);
		studentLee.setMath("수학", 80);
		
		Student4 studentKim = new Student4(124, "Kim");
		studentKim.setKorean("국어", 100);
		studentKim.setMath("수학", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
