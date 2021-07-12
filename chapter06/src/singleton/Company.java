package singleton;

public class Company {

	private static Company instance = new Company();	//instance��� �̸����� Company��ü ����
	private Company() {		//Company��� ��ü�� new Ű���带 ���� �������� ���ϵ��� ��
		
	}
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
