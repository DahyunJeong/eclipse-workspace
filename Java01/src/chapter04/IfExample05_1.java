package chapter04;

import java.util.Scanner;

public class IfExample05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade;

		if (score >= 0) {
			if (score >= 90 && score <= 100)
				grade = 'A';
			else if (score >= 80 && score < 90)
				grade = 'B';
			else if (score >= 70 && score < 80)
				grade = 'C';
			else if (score >= 60 && score < 70)
				grade = 'D';
			else
				grade = 'F';

			System.out.println("당신의 점수는 " + score + "점, 학점은 " + grade + "입니다.");
		}
		else
			System.out.println("점수는 0이상입니다.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int sco;
		char gra;

		while (true) {
			System.out.print("점수를 입력하세요(0~100): ");
			sco = sc.nextInt();

			if (sco == 1000)
				break;
			
			if (sco < 0)
				System.out.println("점수는 양수입니다. ");

			while (sco >= 0) {
				if (sco >= 90 && sco <= 100)
					gra = 'A';
				else if (sco >= 80 && sco < 90)
					gra = 'B';
				else if (sco >= 70 && sco < 80)
					gra = 'C';
				else if (sco >= 60 && sco < 70)
					gra = 'D';
				else
					gra = 'F';

				System.out.println("점수는 " + sco + "점, 학점은 " + gra + "입니다.");
				break;

			}

		}
		sc.close();
	}

}
