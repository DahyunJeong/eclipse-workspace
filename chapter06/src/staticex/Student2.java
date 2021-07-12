package staticex;

public class Student2 {

	private static int serialNum = 1000;
		//외부 클래스에서 접근 차단, setter에서 변수 할당, getter에서 값을 가지고 온다.
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
	//	studnetName = " ";	//오류 남. 왜냐하면 이 메소드는 static 메소드이기 때문!
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
