package chapter_array;

public class ForeachEx {

	enum week {��, ȭ, ��, ��, ��, ��, ��}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {1, 2, 3, 4, 5};
		String[] name = {"���", "��", "�ٳ���", "ü��", "����", "����"};
		
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("���� " + sum);
		
		for(String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(week w : week.values()) {
			System.out.print(w + "���� ");
		}
		
	}

}
