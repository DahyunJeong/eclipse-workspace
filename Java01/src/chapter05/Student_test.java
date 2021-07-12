package chapter05;

public class Student_test {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public Student_test() {
		
	}
	
	public void showStudentInfo () {
		System.out.println(studentName + ", " + address);
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "ÀÔ´Ï´Ù.");
	}

}
