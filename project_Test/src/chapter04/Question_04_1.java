package chapter04;

public class Question_04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0)
				continue;
			
			for(int j = 0; j < (7-i)/2; j++) {
				System.out.print(" ");
			}
				
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			for(int j = 0; j < (7-i)/2; j++) {
				System.out.print(" ");
			}
				
			System.out.println();
		}
		
		System.out.println();
		
		//강사님version
		
		int lineCount = 4;	//출력할 라인 수
		int starCount = 1;	//별을 출력하는 변수
		int spaceCount = 3;	//공백 처리하는 변수
		
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
			
			spaceCount -= 1;
			starCount += 2;
			
			System.out.println();
		}
		
	}

}
