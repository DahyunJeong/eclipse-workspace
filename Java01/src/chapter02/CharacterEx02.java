package chapter02;

public class CharacterEx02 {
	public static void main(String[] args) {
		
		char ch1 = 'วั';
		char ch2 = '\uD55C';
		/*
		 * char d1 = '\uB2E4';
		 * char d2 = '\uD604'; 
		 * char d3 = '\uC9F1'; 
		 * char d4 = '\uC9F1'; 
		 * char d5 = '\uB9E8';
		 */
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		char[] d = new char[5];
		d[0] = '\uB2E4';
		d[1] = '\uD604'; 
		d[2] = '\uC9F1';
		d[3] = '\uC9F1';
		d[4] = '\uB9E8';
		
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i]);
		}
		
	}
}
