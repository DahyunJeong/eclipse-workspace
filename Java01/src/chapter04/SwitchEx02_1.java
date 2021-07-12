package chapter04;

import java.util.Scanner;

public class SwitchEx02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("몇 층입니까(0을 누르면 시스템이 종료됩니다.): ");
			num = sc.nextInt();

			if (num == 0) {
				System.out.println("시스템 종료");
				break;
			}

			switch (num) {
			case 1:
				System.out.println(num + "층 약국입니다.");
				break;
			case 2:
				System.out.println(num + "층 정형외과입니다.");
				break;
			case 3:
				System.out.println(num + "층 피부과입니다.");
				break;
			case 4:
				System.out.println(num + "층 치과입니다.");
				break;
			case 5:
				System.out.println(num + "층 헬스 클럽입니다.");
				break;
			default:
				System.out.println("건물에 없는 층입니다. 다시 선택해 주세요.");
				break;
			}
		}
		sc.close();
	}

}
