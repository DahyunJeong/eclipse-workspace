package chapter04;

import java.util.Scanner;

public class SwitchEx02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�� ���Դϱ�(0�� ������ �ý����� ����˴ϴ�.): ");
			num = sc.nextInt();

			if (num == 0) {
				System.out.println("�ý��� ����");
				break;
			}

			switch (num) {
			case 1:
				System.out.println(num + "�� �౹�Դϴ�.");
				break;
			case 2:
				System.out.println(num + "�� �����ܰ��Դϴ�.");
				break;
			case 3:
				System.out.println(num + "�� �Ǻΰ��Դϴ�.");
				break;
			case 4:
				System.out.println(num + "�� ġ���Դϴ�.");
				break;
			case 5:
				System.out.println(num + "�� �ｺ Ŭ���Դϴ�.");
				break;
			default:
				System.out.println("�ǹ��� ���� ���Դϴ�. �ٽ� ������ �ּ���.");
				break;
			}
		}
		sc.close();
	}

}
