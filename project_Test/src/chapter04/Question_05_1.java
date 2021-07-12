package chapter04;

public class Question_05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 8; i++) {
			if (i % 2 == 0)
				continue;
			
			for(int j = 0; j < (7-i)/2; j++) {
				System.out.print(" ");
			}
				
			for (int j = 1; j < (i + 1); j++) {
				System.out.print("*");
			}
			
			for(int j = 0; j < (7-i)/2; j++) {
				System.out.print(" ");
			}
				
			System.out.println();
		}
		
		//* 줄어드는 반복문..
		
		for (int i = 5; i > 0; i--) {
			if (i % 2 == 0)
				continue;
			
			for(int j = 0; j < (7-i)/2; j++) {
				System.out.print(" ");
			}
				
			for (int j = 1; j < (i + 1); j++) {
				System.out.print("*");
			}
			
			for(int j = 0; j < (7-i)/2; j++) {
				System.out.print(" ");
			}
				
			System.out.println();
		}
		
		System.out.println();
		//강사님version
		
		int lineCount = 7;
		int starCount = 1;
		int spaceCount = 3;
		
		for(int i = 0; i <lineCount; i++) {
			
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < starCount; j ++) {
				System.out.print("*");
			}
			
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			
			if(i < lineCount/2) {
				spaceCount -= 1;
				starCount += 2;
			} else {
				spaceCount += 1;
				starCount -= 2;
			}
			
			
			System.out.println();
		}
		
	}

}
