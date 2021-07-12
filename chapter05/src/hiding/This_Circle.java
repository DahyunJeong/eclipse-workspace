package hiding;

public class This_Circle {

	int radius;

//	public This_Circle() {}

	public This_Circle(int radius) {	//input 받는 변수 이름 = 할당하는 이름 = 대입되는 변수 이름
		this.radius = radius;
	}

	public void setCircle(int radius) {
		this.radius = radius;
	}

/*	public int getCircle() {
		return this.radius;
	}
*/
	
	public static void main(String[] args) {
		This_Circle ob1 = new This_Circle(1);
		This_Circle ob2 = new This_Circle(2);
		This_Circle ob3 = new This_Circle(3);


		System.out.println("ob1 radius: " + ob1.radius);
		System.out.println("ob2 radius: " + ob2.radius);
		System.out.println("ob3 radius: " + ob3.radius);
		System.out.println(" ");
		
		ob1.setCircle(4);
		ob2.setCircle(5);
		ob3.setCircle(6);
		
		System.out.println("ob1 radius: " + ob1.radius);
		System.out.println("ob2 radius: " + ob2.radius);
		System.out.println("ob3 radius: " + ob3.radius);

		
	}

}
