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
			System.out.print("나이: ");
			age = sc.nextInt();

			if (age ==0) 
				break;
			
			while (true) {

				if (age < 8) {
					charge = 1000;
					System.out.println("취학 전 아동입니다.");
				} else if (age < 14) {
					charge = 2000;
					System.out.println("초등학생입니다.");
				} else if (age < 20) {
					charge = 2500;
					System.out.println("중, 고등학생입니다.");
				} else {
					charge = 3000;
					System.out.println("일반인입니다.");
				}

				System.out.println("입장료는 " + charge + "원입니다. \n");
				break;
			}
			i++;
		}
		sc.close();
	}

}
