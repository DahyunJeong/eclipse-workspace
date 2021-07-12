package staticex;

public class StudentTest4 {

	public static void main(String[] args) {

		System.out.println(Student2.getSerialNum());
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("ÀÌÁö¿ø");
		System.out.println(Student2.getSerialNum());
		
		System.out.println(studentLee.studentName + " ÇĞ¹ø: " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("¼Õ¼ö°æ");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " ÇĞ¹ø: " + studentSon.studentID);
	
		Student2.setSerialNum(1223);
		System.out.println(Student2.getSerialNum());

		Student2 studentKim = new Student2();
		studentKim.setStudentName("±è¶¯¶¯");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentKim.studentName + " ÇĞ¹ø: " + studentKim.studentID);		
		
	}

}
