package chapter04;
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
		String name = sc.next();
		System.out.print("�̸��� " + name + ", ");
		
		String city = sc.next();
		System.out.print("���ô� " + city + ", ");
		
		int age = sc.nextInt();
		System.out.print("���̴� " + age + "�� , ");
		
		double weight = sc.nextDouble();
		System.out.print("ü���� " + weight + ", ");
		
		boolean single = sc.nextBoolean();
		System.out.println("���� ���δ� " + single + "�Դϴ�.");
		
		sc.close();
	}

}
