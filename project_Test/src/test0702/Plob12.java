package test0702;

import java.util.Scanner;

public class Plob12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.print("3�� ����� ");
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 3 == 0)
				System.out.print(num[i] + " ");
		}				
		sc.close();
	}
}
