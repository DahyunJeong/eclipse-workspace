package constructor;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personKim = new Person();
		personKim.name = "������";
		personKim.height = 184F;
		personKim.weight = 85.5F;
		
		Person personLee = new Person("�̼���", 175, 75);
		
		
	}
}
