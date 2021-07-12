package chapter05;

public class Student {
	
	int studentID;				//멤버 변수(속성 정의한 것)
	String studentName;			//
	int grade;					//
	String address;				//
	
	
	//기능 구현하는 메서드 부분
	public void showStudentInfo() {		//이름과 주소 출력하는 메서드 //메서드(=기능)
		System.out.println(studentName + ", " + address);	
	}
	
	public String getStudentName() {	//
		return studentName;
	}
	
	public void setStudentName(String name) {	//이름 정의하는 메서드
		studentName = name;
	}

	public static void main(String[] args) {

		Student st = new Student();	//Student를 복사한 st이름의 클래스 생성
		st.studentName = "임연수";	//객체 멤버변수의 값 정의
		
		System.out.println(st.studentName);			//객체의 멤버변수의 값 출력한 것
		System.out.println(st.getStudentName());	//메서드 호출
	}

}
