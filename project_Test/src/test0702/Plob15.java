package test0702;

public class Plob15 {

	public static void main(String[] args) {

		int num = 0;

		for (int ten = 0; ten < 10; ten++) { // 10�� �ڸ�
			for (int i = 0; i < 10; i++) { // 1�� �ڸ�
				num = ten * 10 + i;
				if (i == 3 || i == 6 || i == 9) { // 1�� �ڸ��� 3, 6, 9�� �� ���ư�
					System.out.print(num + "�ڼ� ¦"); // ȭ�� ���
					if (ten == 3 || ten == 6 || ten == 9) { // 10�� �ڸ��� 3, 6, 9�� ��
						System.out.println("¦"); // ȭ�鿡 ¦ �� �� �� ���
					} else
						System.out.println(); // �ƴ� �� �� ĭ ����
				} else if (ten == 3 || ten == 6 || ten == 9) {
					System.out.println(num + "�ڼ� ¦");
				}
			}
		}
		System.out.println();

		int a, b; // a�� 10�� �ڸ�, b�� 1�� �ڸ�
		for (int i = 1; i < 100; i++) {
			a = i / 10;
			b = i % 10;
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
				System.out.println(i + "�ڼ� ¦¦");
			}
			else if ((a == 3 || a == 6 || a == 9) && (b != 3 || b != 6 || b != 9)) {
				System.out.println(i + "�ڼ� ¦");
			} 
			else if ((a != 3 || a != 6 || a != 9) && (b == 3 || b == 6 || b == 9)) {
				System.out.println(i + "�ڼ� ¦");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i< 100; i++) {
			System.out.print("i = " + i);
			int tmp = i;
			
			do {
				if(tmp%10%3 == 0 && tmp%10 != 0) 
					System.out.print("¦");
			}while((tmp /= 10) != 0);
				System.out.println();
		}
	}
}