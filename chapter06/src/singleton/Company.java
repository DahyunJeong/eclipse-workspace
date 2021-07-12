package singleton;

public class Company {

	private static Company instance = new Company();	//instance라는 이름으로 Company객체 생성
	private Company() {		//Company라는 객체를 new 키워드를 통해 생서하지 못하도록 함
		
	}
	
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
