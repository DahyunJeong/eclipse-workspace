package chapter04;

import java.util.Scanner;

public class IfExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		int charge;
		int i = 0;
		Scanner sc = new Scanner(System.in);

		while (i < 5) {
			System.out.print("����: ");
			age = sc.nextInt();

			if (age ==0) 
				break;
			
			while (true) {

				if (age < 8) {
					charge = 1000;
					System.out.println("���� �� �Ƶ��Դϴ�.");
				} else if (age < 14) {
					charge = 2000;
					System.out.println("�ʵ��л��Դϴ�.");
				} else if (age < 20) {
					charge = 2500;
					System.out.println("��, ����л��Դϴ�.");
				} else {
					charge = 3000;
					System.out.println("�Ϲ����Դϴ�.");
				}

				System.out.println("������ " + charge + "���Դϴ�. \n");
				break;
			}
			i++;
		}
		sc.close();
	}

}
