package test0702;

import java.util.Scanner;

public class Plob13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //ȯ���� ���� ����
		int[] num = new int[8];	//�� ���� ���� ������ ������ ����
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		int money = sc.nextInt();
		int money2 = money;

		for(int i = 0; i < unit.length; i++) {
			if(i == 0) {	//50000���� ��
					num[i] = money / unit[i];
				}
			for(int j = 0; j < i; j++) {	//50000�� �ƴ� ��� ���
					num[i] = (money % unit[j]) / unit[i];
			}			
			System.out.println(unit[i] + " �� ¥��: " + num[i] + "��");
		}
		
		//�ٸ� ���
		System.out.println();
		System.out.println("�ٸ� �����~ �� �����ϴ�.. ");
		int n = 0;
		for(int i = 0; i < unit.length; i++) {
			n = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + " �� ¥��: " + n + "��");

		}
		
		
		System.out.println();
		for(int i = 0; i < unit.length; i++) {
			System.out.printf("%d ��¥��: %d�� \n", unit[i], money2/unit[i]);
	//		money2 = money2 - (money2 / unit[i])*unit[i];
			money2 = money2 % unit[i];
		}
		
		sc.close();
	}
}


/*		num[0] = money /unit[0];
		num[1] = (money % unit[0]) / unit[1];
		num[2] = ((money % unit[0]) % unit[1]) / unit[2];	//���� ���� �ʳ� �տ��� ���� ����..!
		num[3] = (((money % unit[0]) % unit[1]) % unit[2]) / unit[3];
		num[4] = ((((money % unit[0]) % unit[1]) % unit[2]) % unit[3]) / unit[4];
		*/
