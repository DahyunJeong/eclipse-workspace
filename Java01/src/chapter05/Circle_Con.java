package chapter05;

public class Circle_Con {
	
	int radius;
	String name;
	
	public Circle_Con() {					//�⺻ ������ **�����ڿ��� return���� ����!
		radius = 1;
		name = " ";
	}
	
	public Circle_Con(int r, String n) {	//�Ű� ���� ���� ������
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	

	public static void main(String[] args) {
		
		Circle_Con cc = new Circle_Con();	//�Ű����� ���� ������ ȣ��
		
		System.out.println("�⺻�����ڰ�: " + cc.getArea());
		
		cc.radius = 2;
		System.out.println("�Է��� radius: " + cc.radius + " ������ ����: " + cc.getArea());
		
		Circle_Con pizza = new Circle_Con(10, "�ڹ�����");	//�Ű������� ���� ������ ȣ��
		System.out.println(pizza.name + "�� ������ " + pizza.getArea() + "�Դϴ�.");
		
		
	}

}
