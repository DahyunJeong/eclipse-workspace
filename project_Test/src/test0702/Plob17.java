package test0702;

import java.util.Scanner;

public class Plob17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String game;
		String[] str = { "가위", "바위", "보" };
		String result = "";
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		while (true) {
			System.out.print("가위 바위 보!>> ");
			game = sc.next();

			n = (int) (Math.random() * 3);

			if (game.equals("그만")) {
				System.out.println("게임을 종료합니다. ");
				break;
			}
			
			if(str[n].equals(game)) {
				result = " 비겼습니다";
			}
			else if((game.equals("가위") && str[n].equals("바위")) || 
					(game.equals("바위") && str[n].equals("보")) ||
					(game.equals("보") && str[n].equals("가위"))) {	//졌을 경우
				result = " 사용자가 졌습니다.";
			}
			else if ((game.equals("가위") && str[n].equals("보")) || 
					(game.equals("바위") && str[n].equals("가위")) ||
					(game.equals("보") && str[n].equals("바위"))) {	//이겼을 경우
				result = " 사용자가 이겼습니다.";
			}
			else {
				System.out.println("오류");	//가위 바위 보 외의 다른 것을 입력했을 경우
				continue;
			}
	
			System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + result);
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
 * String[] str = { "가위", "바위", "보" };
 * 
 * String result = "";
 * 
 * 
 * 
 * System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
 * 
 * while (true) {
 * 
 * System.out.print("가위 바위 보!>> ");
 * 
 * game = sc.next();
 * 
 * 
 * 
 * n = (int) (Math.random() * 3);
 * 
 * 
 * 
 * if (game.equals("그만")) {
 * 
 * System.out.println("게임을 종료합니다. ");
 * 
 * break;
 * 
 * }
 * 
 * 
 * 
 * if (str[n].equals("가위")) {
 * 
 * if (game.equals("가위")) {
 * 
 * result = " 비겼습니다.";
 * 
 * } else if (game.equals("바위")) {
 * 
 * result = " 사용자가 이겼습니다.";
 * 
 * } else {
 * 
 * result = " 사용자가 졌습니다.";
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * else if (str[n].equals("바위")) {
 * 
 * if (game.equals("가위")) {
 * 
 * result = " 사용자가 졌습니다.";
 * 
 * } else if (game.equals("바위")) {
 * 
 * result = " 비겼습니다.";
 * 
 * } else {
 * 
 * result = " 사용자가 이겼습니다.";
 * 
 * }
 * 
 * 
 * 
 * } else if (str[n].equals("보")) {
 * 
 * if (game.equals("가위")) {
 * 
 * result = " 사용자가 이겼습니다.";
 * 
 * } else if (game.equals("바위")) {
 * 
 * result = " 사용자가 졌습니다.";
 * 
 * } else {
 * 
 * result = " 비겼습니다.";
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + result);
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
 * if (str[n].equals("가위")) { if (game.equals("가위")) { r = 2; } else if
 * (game.equals("바위")) { r = 0; } else { r = 1; } }
 * 
 * else if (str[n].equals("바위")) { if (game.equals("가위")) { r = 1; } else if
 * (game.equals("바위")) { r = 2; } else { r = 0; }
 * 
 * } else if (str[n].equals("보")) { if (game.equals("가위")) { r = 0; } else if
 * (game.equals("바위")) { r = 1; } else { r = 2; } }
 * 
 * System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + result[r]);
 */