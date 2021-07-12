package chapter_array;

public class ForeachEx {

	enum week {월, 화, 수, 목, 금, 토, 일}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {1, 2, 3, 4, 5};
		String[] name = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		for(String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(week w : week.values()) {
			System.out.print(w + "요일 ");
		}
		
	}

}
