package test0702;

import java.util.Scanner;

public class Plob16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;

		String[] course = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int[] score = { 95, 88, 76, 62, 55 };

		while (true) {
			int n = 0;								//�ݺ����� ���ư� ������ �ʱ�ȭ ����� ��, ���� ������ ����
			System.out.print("���� �̸�>> ");
			name = sc.next();
			
			if (name.equals("�׸�")) {
				break;
			}

			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {		//���� �̸��� ��ġ�ϴ��� ã��
					n = score[i];					//��ġ�ϸ� ������ n�� ������
				}
			}

			if (n != 0) {							//n != 0 �� n�� ���� ������ ���Եƴٴ� ��
				System.out.println(name + "�� ������ " + n);
			} else if (n == 0) {					//���� ����=> ���� ����
				System.out.println("���� �����Դϴ�.");
			}
		}
		sc.close();
	}
}
