package abstractex;

public abstract class Computer {		//추상 메소드가 하나라도 있으면 추상 클래스가 돼야 함
	abstract public void display();		//추상 메소드: 선언부만 존재, 실행부x
	public abstract void typing();		// public 앞 뒤로 abstract 들어갈 수 있음
	
	//public int add(int a, int b) { }	//일반 메소드
	
	public void tunOn() {
		System.out.println("전원을 켭니다.");
	}
	public void tunOff() {
		System.out.println("전원을 끕니다.");
	}
}
