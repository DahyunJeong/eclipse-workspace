package chapter04;

import java.util.Scanner;

public class Test_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г��� �Է��ϼ���(1~4): ");
		int year = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = sc.nextInt();
		
		if(year == 4) {
			if(score >= 70)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!");
		}
		else {
			if(score >= 60)
				System.out.println("�հ�!");
			else
				System.out.println("���հ�!");
		}
			
		sc.close();
	}

}
