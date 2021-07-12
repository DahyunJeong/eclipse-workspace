package chapter04;

import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하십시오: ");
		
		int score = sc.nextInt();
		
		if(score >= 80)
			System.out.println("축하합니다! " +score + "점으로 합격입니다. ");
		else
			System.out.println(score+"점으로 탈락입니다.");
		
		sc.close();
	}

}
