package gamelevel;

public class Player {
	private PlayerLevel level;		//객체형 데이터
	
	public Player() {
		level = new BeginnerLevel();		//PlayerLevel level = new BeginnerLevel 업캐스팅
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {	//객체를 인풋값으로 받고 형변환(업캐스팅)
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
