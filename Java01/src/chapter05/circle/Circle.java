package chapter05.circle;

public class Circle {

	int radius;	//원의 반지름 변수
	String name;	//원 이름
	
	public Circle() {	//class의 기본 생성자
						//실행부가 없는 생성자: 기본 생성자, 기본 생성자는 생략 가넝
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
