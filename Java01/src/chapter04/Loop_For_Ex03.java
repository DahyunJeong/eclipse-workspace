package chapter04;

public class Loop_For_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			System.out.println("num: " + num);
			if(num % 2 == 0)
				continue;
			
			total += num;
			System.out.println("for문 total: " + total);
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total);
	}

}
