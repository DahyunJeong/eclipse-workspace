package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);	//static은 객체 없이도 호출 가넝
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);
				
	}

}
