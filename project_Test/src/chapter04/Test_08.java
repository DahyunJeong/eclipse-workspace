package chapter04;

import java.util.Scanner;

public class Test_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력하세요(1~4): ");
		int year = sc.nextInt();
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		if(year == 4) {
			if(score >= 70)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		}
		else {
			if(score >= 60)
				System.out.println("합격!");
			else
				System.out.println("불합격!");
		}
			
		sc.close();
	}

}
