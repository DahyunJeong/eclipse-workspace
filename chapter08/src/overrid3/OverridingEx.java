package overrid3;

public class OverridingEx {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ���: " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("���� ���: " + weapon.fire());
		
		
	}

}