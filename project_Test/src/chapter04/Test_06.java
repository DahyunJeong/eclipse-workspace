package chapter04;

import java.util.Scanner;

public class Test_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��Ͻÿ�: ");
		int num = sc.nextInt();

		if (num == 0)
			System.out.println("0�� 3�� ����� �ƴմϴ�.");
		else {
			if (num % 3 == 0)
				System.out.println("�Է��� �� " + num + "�� 3�� ����Դϴ�.");
			else
				System.out.println("�Է��� �� " + num + "�� 3�� ����� �ƴմϴ�.");
		}
		sc.close();
	}

}
