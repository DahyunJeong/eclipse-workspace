package chapter_array;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;	//sum �ʱ�ȭ ���� ����!
		
		System.out.print("5���� ������ �Է��ϼ���>> ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		System.out.println("����� " + (double)sum/array.length);
		
		sc.close();
	}

}
