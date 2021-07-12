package test0702;

import java.util.Scanner;

public class Plob16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;

		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };

		while (true) {
			int n = 0;								//반복문이 돌아갈 때마다 초기화 해줘야 함, 점수 저장할 변수
			System.out.print("과목 이름>> ");
			name = sc.next();
			
			if (name.equals("그만")) {
				break;
			}

			for (int i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {		//과목 이름과 일치하는지 찾기
					n = score[i];					//일치하면 점수를 n에 대입함
				}
			}

			if (n != 0) {							//n != 0 은 n의 값에 점수가 대입됐다는 것
				System.out.println(name + "의 점수는 " + n);
			} else if (n == 0) {					//점수 없음=> 과목도 없음
				System.out.println("없는 과목입니다.");
			}
		}
		sc.close();
	}
}
