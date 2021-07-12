package chapter_array;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < array.length; i ++) {
			array[i] = sc.nextInt();
			
			if(max < array[i]) {		//입력받는 값이랑 같이 들어가도 되는구낭~!
				max = array[i];
			}
			else
				continue;
		}

		/*
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			else
				continue;
		}
		*/
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		sc.close();
		
	}

}
