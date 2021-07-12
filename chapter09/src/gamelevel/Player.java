package gamelevel;

public class Player {
	private PlayerLevel level;		//��ü�� ������
	
	public Player() {
		level = new BeginnerLevel();		//PlayerLevel level = new BeginnerLevel ��ĳ����
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {	//��ü�� ��ǲ������ �ް� ����ȯ(��ĳ����)
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}