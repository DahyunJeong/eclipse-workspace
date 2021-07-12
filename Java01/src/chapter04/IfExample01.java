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

			System.out.print("나이: ");

			age = sc.nextInt();

			if (age >= 8 && age < 25) {
				System.out.println("학교에 다닙니다.");
			}
			
			else
				System.out.println("학교에 다니지 않습니다.");

			i++;
		}
		sc.close();
	}

}
