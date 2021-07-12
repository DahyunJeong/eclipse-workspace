package chapter04;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 2;
		double result = 0;
		
		System.out.print("연산 기호를 입력하시오(+, -, *, /): ");
		
		String operator = sc.next();
		char ch = operator.charAt(0);	//형 변환, 첫번째 문자를 char형으로 변환하여 저장
		
		if (ch == '+')
			result = num1 + num2;
		else if (ch == '-')
			result = num1 - num2;
		else if (ch == '*')
			result = num1 * num2;
		else if (ch == '/')
			result = num1 / num2;
		else {
			System.out.println("연산자 오류입니다.");
			sc.close();
			return;			//return 앞에 sc.close()해줘야 실행이 종료됐을 때 sc가 닫힘
		}
	
		System.out.println("if문 (형변환) 활용한 " + operator + " 연산: " + result);
		
		result = 0; //초기화 시키고 equals 사용
		if (operator.equals("+"))
			result = num1 + num2;
		else if (operator.equals("-"))
			result = num1 - num2;
		else if (operator.equals("*"))
			result = num1 * num2;
		else if (operator.equals("/"))
			result = num1 / num2;

		if (result == 0)
			System.out.println("연산 기호를 다시 입력하십시오.");
		else
			System.out.println("if문 (equals)활용한 " + operator + " 연산: " + result);
		
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
			System.out.println("연산 기호를 다시 입력하십시오.");
		else
			System.out.println("switch문 활용한 " + operator + " 연산: " + result);

		sc.close();
	
	}

}
