package chapter_array;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int max = 0;
		
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i < array.length; i ++) {
			array[i] = sc.nextInt();
			
			if(max < array[i]) {		//�Է¹޴� ���̶� ���� ���� �Ǵ±���~!
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
		
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		sc.close();
		
	}

}
