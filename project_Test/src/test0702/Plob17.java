package test0702;

import java.util.Scanner;

public class Plob17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String game;
		String[] str = { "����", "����", "��" };
		String result = "";
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");

		while (true) {
			System.out.print("���� ���� ��!>> ");
			game = sc.next();

			n = (int) (Math.random() * 3);

			if (game.equals("�׸�")) {
				System.out.println("������ �����մϴ�. ");
				break;
			}
			
			if(str[n].equals(game)) {
				result = " �����ϴ�";
			}
			else if((game.equals("����") && str[n].equals("����")) || 
					(game.equals("����") && str[n].equals("��")) ||
					(game.equals("��") && str[n].equals("����"))) {	//���� ���
				result = " ����ڰ� �����ϴ�.";
			}
			else if ((game.equals("����") && str[n].equals("��")) || 
					(game.equals("����") && str[n].equals("����")) ||
					(game.equals("��") && str[n].equals("����"))) {	//�̰��� ���
				result = " ����ڰ� �̰���ϴ�.";
			}
			else {
				System.out.println("����");	//���� ���� �� ���� �ٸ� ���� �Է����� ���
				continue;
			}
	
			System.out.println("����� = " + game + ", ��ǻ�� = " + str[n] + result);
		}
		
		sc.close();
	}
}

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * int n;
 * 
 * String game;
 * 
 * String[] str = { "����", "����", "��" };
 * 
 * String result = "";
 * 
 * 
 * 
 * System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
 * 
 * while (true) {
 * 
 * System.out.print("���� ���� ��!>> ");
 * 
 * game = sc.next();
 * 
 * 
 * 
 * n = (int) (Math.random() * 3);
 * 
 * 
 * 
 * if (game.equals("�׸�")) {
 * 
 * System.out.println("������ �����մϴ�. ");
 * 
 * break;
 * 
 * }
 * 
 * 
 * 
 * if (str[n].equals("����")) {
 * 
 * if (game.equals("����")) {
 * 
 * result = " �����ϴ�.";
 * 
 * } else if (game.equals("����")) {
 * 
 * result = " ����ڰ� �̰���ϴ�.";
 * 
 * } else {
 * 
 * result = " ����ڰ� �����ϴ�.";
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * else if (str[n].equals("����")) {
 * 
 * if (game.equals("����")) {
 * 
 * result = " ����ڰ� �����ϴ�.";
 * 
 * } else if (game.equals("����")) {
 * 
 * result = " �����ϴ�.";
 * 
 * } else {
 * 
 * result = " ����ڰ� �̰���ϴ�.";
 * 
 * }
 * 
 * 
 * 
 * } else if (str[n].equals("��")) {
 * 
 * if (game.equals("����")) {
 * 
 * result = " ����ڰ� �̰���ϴ�.";
 * 
 * } else if (game.equals("����")) {
 * 
 * result = " ����ڰ� �����ϴ�.";
 * 
 * } else {
 * 
 * result = " �����ϴ�.";
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * System.out.println("����� = " + game + ", ��ǻ�� = " + str[n] + result);
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * sc.close();
 * 
 * }
 * 
 */

/*
 * if (str[n].equals("����")) { if (game.equals("����")) { r = 2; } else if
 * (game.equals("����")) { r = 0; } else { r = 1; } }
 * 
 * else if (str[n].equals("����")) { if (game.equals("����")) { r = 1; } else if
 * (game.equals("����")) { r = 2; } else { r = 0; }
 * 
 * } else if (str[n].equals("��")) { if (game.equals("����")) { r = 0; } else if
 * (game.equals("����")) { r = 1; } else { r = 2; } }
 * 
 * System.out.println("����� = " + game + ", ��ǻ�� = " + str[n] + result[r]);
 */