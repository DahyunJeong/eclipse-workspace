package chapter04;

import java.util.*;

public class IfExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		int age;

		 int i = 0;
		 
		while (i < 5) {
		//	Scanner sc = new Scanner(System.in);

			System.out.print("����: ");

			age = sc.nextInt();

			if (age >= 8 && age < 25) {
				System.out.println("�б��� �ٴմϴ�.");
			}
			
			else
				System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");

			i++;
		}
		sc.close();
	}

}
