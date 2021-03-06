package chapter04;

import java.util.Scanner;

class Day {
	private String work;

	public Day() {

	}

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	int date;
	Day[] day;

	public MonthSchedule(int date) {
		day = new Day[date];
		this.date = date;
	}

	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int num = sc.nextInt();

			if (num == 3) {
				finish();
				break;
			}

			System.out.print("날짜(1~" + date + ")? ");
			int d = sc.nextInt();
			// 흠.. day[d]이 이미 있으면 안 생기게 해야하는뎁..
			day[d] = new Day();

			switch (num) {
			case 1:
				input(d);
				System.out.println();
				break;
			case 2:
				view(d);
				System.out.println();
				break;
			default:
				System.out.println("번호를 다시 선택하세요.");
				break;
			}
		}
	}

	public void input(int d) {
		// System.out.print("날짜(1~"+date + ")? ");
		// int d = sc.nextInt();
		// day[d] = new Day();
		System.out.print("할일(빈칸없이입력)?");
		String work = sc.next();
		day[d].set(work);
	}

	public void view(int d) {
//		System.out.print("날짜(1~"+date + ")? ");
//		int d = sc.nextInt();
		System.out.print(d + "일의 할 일은 ");
		day[d].show();
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

	public static void main(String[] args) {

		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
