package inheritance;

public class ColorPoint extends Point {
	private String color;		//점의 색 
	
	public void setColor(String color) {
		this.color = color;
/*		x = 3;						//상속된 관계라서 부모 클래스의 protected 변수를 사용할 수 있다.
		y = 5;
		set(1, 2);					// public class라 사용 가능
	*/	
	}
	
	public void showColorPoint() {
		System.out.print(color + ": ");
		showPoint();				//상속받은 메소드 호출
	}
	
}
