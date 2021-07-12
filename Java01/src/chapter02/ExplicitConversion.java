package chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 1.2;
		float f = 0.9F;
		
		int a = (int)d + (int)f;
		int b = (int)(d+f);
		System.out.println(a);
		System.out.println(b);
	}

}
