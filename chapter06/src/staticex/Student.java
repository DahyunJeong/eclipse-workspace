package staticex;

public class Student {
	
	public static int serialNum = 1000;	//클래스 변수(모든 인스턴스에서 접근 가넝) <== 데이터영역 생성
	int studentID;			//멤버변수(=인스턴스변수) <== 힙영역에 생성
	String studentName;		//멤버변수(=인스턴스변수)
	int grade;				//멤버변수(=인스턴스변수)
	String address;			//멤버변수(=인스턴스변수)
	
//	studentID = 1234;		//왜 초기화 안 되는지? -> class 자체로는 아직 아무것도 없는 상태, 객체가 생성되고 나서
//	serialNum = 1012;		//멤버변수들이 생기기 때문에 class 자체에 변수를 따로 초기화하면 오류가 난다.

	/*	
	public String getStudentName() {
		studentID = 1234;
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	*/
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}

