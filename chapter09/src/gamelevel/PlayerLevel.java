package gamelevel;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

	/*
	final public void gotest() {
		System.out.println("final이 메서드에 할당될 경우 오버라이딩 불가함");
	}
	public void gotest2() {
		System.out.println("메소드에 final이 없을 경우 오버라이딩 가능");
	}
	*/
}
