package chapter04;

import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻʽÿ�: ");
		
		int score = sc.nextInt();
		
		if(score >= 80)
			System.out.println("�����մϴ�! " +score + "������ �հ��Դϴ�. ");
		else
			System.out.println(score+"������ Ż���Դϴ�.");
		
		sc.close();
	}

}
