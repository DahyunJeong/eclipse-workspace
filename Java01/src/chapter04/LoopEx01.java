package chapter04;

public class LoopEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		num += 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;

		System.out.println("1���� 10������ ���� " + num + "�Դϴ�.");

		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
