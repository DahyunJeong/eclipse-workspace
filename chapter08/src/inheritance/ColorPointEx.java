package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p = new Point();		//Point 클래스의 기본 생성자 호출
		
		p.set(1, 2);
		p.x = 1;
		p.y = 2;
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		
		cp.set(3, 5);				//ColorPoint가 Point를 상속받아 사용할 수 있는 메소드
		cp.x = 3;					//Point의 멤버변수가 Protected로 접근제한자를 두었기에
		cp.y = 5;					//상속관계인 클래스가 사용할 수 있다.
		cp.setColor("red");
		cp.showColorPoint();

	}

}
