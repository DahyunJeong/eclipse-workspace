package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte num;	//byte: 1byte (-2^7 ~ 2^7-1)
		num = -128;
		
		byte num2;
		num2 = 127;
		
		short num3 = -32768;	//short: 2byte (-2^15 ~ 2^15-1)
		short num4 = 32767;
		
		int num5 = 1234567890;
		
		long num6 = 123456789000L;

		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		System.out.println("short num3: " + num3);
		System.out.println("short num4: " + num4);

		System.out.println("integer num5: " + num5);
		
		System.out.println("long num6: " + num6);



	}

}
