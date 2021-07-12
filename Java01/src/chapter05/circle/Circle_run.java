package chapter05.circle;
import chapter05.circle.Circle;

public class Circle_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area;
		
		Circle pizza = new Circle();
		pizza.name = "package Pizza";
		pizza.radius = 10;
		area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area + "입니다.");
		
		Circle donut = new Circle();
		donut.name = "package Donut";
		donut.radius = 2;
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+ area + "입니다.");

	}

}
