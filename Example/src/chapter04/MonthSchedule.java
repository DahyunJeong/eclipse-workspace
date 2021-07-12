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
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
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
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int num = sc.nextInt();

			if (num == 3) {
				finish();
				break;
			}

			System.out.print("��¥(1~" + date + ")? ");
			int d = sc.nextInt();
			// ��.. day[d]�� �̹� ������ �� ����� �ؾ��ϴµ�..
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
				System.out.println("��ȣ�� �ٽ� �����ϼ���.");
				break;
			}
		}
	}

	public void input(int d) {
		// System.out.print("��¥(1~"+date + ")? ");
		// int d = sc.nextInt();
		// day[d] = new Day();
		System.out.print("����(��ĭ�����Է�)?");
		String work = sc.next();
		day[d].set(work);
	}

	public void view(int d) {
//		System.out.print("��¥(1~"+date + ")? ");
//		int d = sc.nextInt();
		System.out.print(d + "���� �� ���� ");
		day[d].show();
	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}

	public static void main(String[] args) {

		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}