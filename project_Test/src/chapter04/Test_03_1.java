package chapter04;

import java.util.Scanner;

public class Test_03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		
		int num = sc.nextInt();
		int time = (num / 60) / 60;
		int min = (num / 60) % 60;
		int sec = num % 60;
		
		System.out.println(num + "�ʴ� " + time + "�ð� " + min + "�� " + sec + "���Դϴ�.");
		
		sc.close();
	}

}
