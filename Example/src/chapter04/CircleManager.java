package chapter04;

import java.util.Scanner;

class Circle {
	double x, y; // private로 해서도 해보기 get set 활용해서~!
	int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		int num = 0;
		int max = 0;

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius>> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}

		for (int i = 0; i < c.length; i++) {
			c[i].show();
			if (c[i].radius > num) {
				num = c[i].radius;
				max = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[max].show();
		sc.close();
	}

}
