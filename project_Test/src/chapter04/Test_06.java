package chapter04;

import java.util.Scanner;

public class Test_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력하시오: ");
		int num = sc.nextInt();

		if (num == 0)
			System.out.println("0은 3의 배수가 아닙니다.");
		else {
			if (num % 3 == 0)
				System.out.println("입력한 값 " + num + "은 3의 배수입니다.");
			else
				System.out.println("입력한 값 " + num + "은 3의 배수가 아닙니다.");
		}
		sc.close();
	}

}
