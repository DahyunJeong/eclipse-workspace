package chapter04;

import java.util.Scanner;

public class Test_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		
		int score = sc.nextInt();
		char grade = 'N';
		
		if(score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 && score <= 90)
			grade = 'B';
		else if (score >= 70 && score <= 80)
			grade = 'C';
		else if (score >= 60 && score <= 70)
			grade = 'D';
		else if (score >= 0 && score <= 60)
			grade = 'F';
		
		if(grade == 'N') 
			System.out.println("������ �ٽ� �Է��� �ּ���.");
		else
			System.out.println("������ " + score + "��, ������ " + grade + "�Դϴ�.");
		
		sc.close();
	}

}
