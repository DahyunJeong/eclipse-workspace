package chapter05;

public class Circle {
	
	int radius;	//���� ������ ����
	String name;	//�� �̸�
	
	public Circle() {	//class�� �⺻ ������
						//����ΰ� ���� ������: �⺻ ������, �⺻ �����ڴ� ���� ����
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area;
		
		Circle pizza;
		pizza = new Circle();	// Circle ��ü ����, ���۷��� �̸� pizza
		
		Circle donut = new Circle();
		
		pizza.radius = 5;
		pizza.name = "Java Pizza";
		area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ "+ area + "�Դϴ�.");
		
		donut.radius = 2;
		donut.name = "Java Donut";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ "+ area + "�Դϴ�.");

	}

}
