package abstractex;

public abstract class Computer {		//�߻� �޼ҵ尡 �ϳ��� ������ �߻� Ŭ������ �ž� ��
	abstract public void display();		//�߻� �޼ҵ�: ����θ� ����, �����x
	public abstract void typing();		// public �� �ڷ� abstract �� �� ����
	
	//public int add(int a, int b) { }	//�Ϲ� �޼ҵ�
	
	public void tunOn() {
		System.out.println("������ �մϴ�.");
	}
	public void tunOff() {
		System.out.println("������ ���ϴ�.");
	}
}
