package staticex;

public class StudentTest4 {

	public static void main(String[] args) {

		System.out.println(Student2.getSerialNum());
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNum());
		
		System.out.println(studentLee.studentName + " �й�: " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " �й�: " + studentSon.studentID);
	
		Student2.setSerialNum(1223);
		System.out.println(Student2.getSerialNum());

		Student2 studentKim = new Student2();
		studentKim.setStudentName("�趯��");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentKim.studentName + " �й�: " + studentKim.studentID);		
		
	}

}
