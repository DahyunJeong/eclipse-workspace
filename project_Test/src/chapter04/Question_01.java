package chapter04;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 2;
		double result = 0;
		
		System.out.print("���� ��ȣ�� �Է��Ͻÿ�(+, -, *, /): ");
		
		String operator = sc.next();
		char ch = operator.charAt(0);	//�� ��ȯ, ù��° ���ڸ� char������ ��ȯ�Ͽ� ����
		
		if (ch == '+')
			result = num1 + num2;
		else if (ch == '-')
			result = num1 - num2;
		else if (ch == '*')
			result = num1 * num2;
		else if (ch == '/')
			result = num1 / num2;
		else {
			System.out.println("������ �����Դϴ�.");
			sc.close();
			return;			//return �տ� sc.close()����� ������ ������� �� sc�� ����
		}
	
		System.out.println("if�� (����ȯ) Ȱ���� " + operator + " ����: " + result);
		
		result = 0; //�ʱ�ȭ ��Ű�� equals ���
		if (operator.equals("+"))
			result = num1 + num2;
		else if (operator.equals("-"))
			result = num1 - num2;
		else if (operator.equals("*"))
			result = num1 * num2;
		else if (operator.equals("/"))
			result = num1 / num2;

		if (result == 0)
			System.out.println("���� ��ȣ�� �ٽ� �Է��Ͻʽÿ�.");
		else
			System.out.println("if�� (equals)Ȱ���� " + operator + " ����: " + result);
		
		result = 0;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			break;
		}
		if (result == 0)
			System.out.println("���� ��ȣ�� �ٽ� �Է��Ͻʽÿ�.");
		else
			System.out.println("switch�� Ȱ���� " + operator + " ����: " + result);

		sc.close();
	
	}

}
