package chapter05;

public class Circle_Con {
	
	int radius;
	String name;
	
	public Circle_Con() {					//기본 생성자 **생성자에는 return값이 없다!
		radius = 1;
		name = " ";
	}
	
	public Circle_Con(int r, String n) {	//매개 변수 가진 생성자
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	

	public static void main(String[] args) {
		
		Circle_Con cc = new Circle_Con();	//매개변수 없는 생성자 호출
		
		System.out.println("기본생성자값: " + cc.getArea());
		
		cc.radius = 2;
		System.out.println("입력한 radius: " + cc.radius + " 변경한 넓이: " + cc.getArea());
		
		Circle_Con pizza = new Circle_Con(10, "자바피자");	//매개변수를 가진 생성자 호출
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea() + "입니다.");
		
		
	}

}
