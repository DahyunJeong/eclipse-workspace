package chapter_array;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;	//sum 초기화 잊지 말자!
		
		System.out.print("5개의 정수를 입력하세요>> ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		System.out.println("평균은 " + (double)sum/array.length);
		
		sc.close();
	}

}
