package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("희희");	//업캐스팅
		Student s;
		s = (Student) p;				//다운캐스팅(자료형 반드시 명시)
/*		
		Student ss;
		Person pp = new Person("훔냐");	//다운캐스팅 위해서는 슈퍼 객체로 만들어야만 다운캐스팅 가능한가? => Yes!!
		ss = (Student) pp;				//다운캐스팅(자료형 반드시 명시)
		System.out.println("pp: " + pp.name);
		*/
		
		System.out.println("p: " + p.name);
		System.out.println("s: " + s.name);
		s.grade = "A";
		
		
		s.name = "변경";
		System.out.println("p: " + p.name);
		System.out.println("s: " + s.name);
		
	//------------------------------------------------------------------	
		Person ps;
		Student sd = new Student("예");	//업
		ps = sd;						//업캐스팅
		
		sd = (Student)ps;				//다운캐스팅
		System.out.println("ps: " + ps.name);
		System.out.println("sd: " + sd.name);
	}

}
