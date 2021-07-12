package chapter05.rectangle;
import java.util.Scanner;

import chapter05.rectangle.Rectangle;

public class Rectangle_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 너비는 " + rect.width + "이고, 높이는 " 
					+ rect.height + "이다. 면적은 " + rect.getArea());
		
		sc.close();
	}

}
