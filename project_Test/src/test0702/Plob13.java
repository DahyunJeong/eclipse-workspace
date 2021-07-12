package test0702;

import java.util.Scanner;

public class Plob13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
		int[] num = new int[8];	//몇 개씩 갖고 있을지 저장할 변수
		
		System.out.print("금액을 입력하시오>> ");
		int money = sc.nextInt();
		int money2 = money;

		for(int i = 0; i < unit.length; i++) {
			if(i == 0) {	//50000원일 때
					num[i] = money / unit[i];
				}
			for(int j = 0; j < i; j++) {	//50000원 아닌 모든 경우
					num[i] = (money % unit[j]) / unit[i];
			}			
			System.out.println(unit[i] + " 원 짜리: " + num[i] + "개");
		}
		
		//다른 방법
		System.out.println();
		System.out.println("다른 방법쓰~ 더 간당하당.. ");
		int n = 0;
		for(int i = 0; i < unit.length; i++) {
			n = money / unit[i];
			money = money % unit[i];
			System.out.println(unit[i] + " 원 짜리: " + n + "개");

		}
		
		
		System.out.println();
		for(int i = 0; i < unit.length; i++) {
			System.out.printf("%d 원짜리: %d개 \n", unit[i], money2/unit[i]);
	//		money2 = money2 - (money2 / unit[i])*unit[i];
			money2 = money2 % unit[i];
		}
		
		sc.close();
	}
}


/*		num[0] = money /unit[0];
		num[1] = (money % unit[0]) / unit[1];
		num[2] = ((money % unit[0]) % unit[1]) / unit[2];	//빼도 되지 않나 앞에서 나온 값을..!
		num[3] = (((money % unit[0]) % unit[1]) % unit[2]) / unit[3];
		num[4] = ((((money % unit[0]) % unit[1]) % unit[2]) % unit[3]) / unit[4];
		*/
