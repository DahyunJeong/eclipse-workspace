package chapter04;

public class Loop_Dowhile_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int sum = 0;
		
		do {
			sum += num++;
		} while(num > 0 && num < 11);
		
		System.out.println(sum);
	}

}
