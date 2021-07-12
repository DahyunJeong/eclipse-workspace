package chapter05;

public class Circle {
	
	int radius;	//원의 반지름 변수
	String name;	//원 이름
	
	public Circle() {	//class의 기본 생성자
						//실행부가 없는 생성자: 기본 생성자, 기본 생성자는 생략 가넝
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area;
		
		Circle pizza;
		pizza = new Circle();	// Circle 객체 생성, 레퍼런스 이름 pizza
		
		Circle donut = new Circle();
		
		pizza.radius = 5;
		pizza.name = "Java Pizza";
		area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area + "입니다.");
		
		donut.radius = 2;
		donut.name = "Java Donut";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+ area + "입니다.");

	}

}
