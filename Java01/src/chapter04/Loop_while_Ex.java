package chapter04;

public class Loop_while_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		
		while(num > 0 && num <= 10) {
			sum += num;
			System.out.println("num: " + num++);
			System.out.println("�߰� sum: " + sum);
//			num++;
		}
		System.out.println("while�� ����� �ݺ������� 1~10������ ��: " + sum);
	}

}
