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

			System.out.println("����� ������ " + score + "��, ������ " + grade + "�Դϴ�.");
		}
		else
			System.out.println("������ 0�̻��Դϴ�.");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		int sco;
		char gra;

		while (true) {
			System.out.print("������ �Է��ϼ���(0~100): ");
			sco = sc.nextInt();

			if (sco == 1000)
				break;
			
			if (sco < 0)
				System.out.println("������ ����Դϴ�. ");

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

				System.out.println("������ " + sco + "��, ������ " + gra + "�Դϴ�.");
				break;

			}

		}
		sc.close();
	}

}
