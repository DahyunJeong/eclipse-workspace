package chapter02;

public class DoubleEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}

}