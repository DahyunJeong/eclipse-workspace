package overrid3;

public class OverridingEx {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 살상: " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포 살상: " + weapon.fire());
		
		
	}

}
