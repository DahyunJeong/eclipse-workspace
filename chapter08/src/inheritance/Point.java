package inheritance;

public class Point {
	protected int x, y;	//좌표 나타내는 변수
						//protected: default 접근 제한자와 비슷함
						//			 다른 패키지의 상속된 클래스 접근 가능함
	
	public void set(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}


