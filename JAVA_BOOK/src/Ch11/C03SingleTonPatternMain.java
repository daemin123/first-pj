package Ch11;


class Company {
	int n1;
	int n2;
	
	// 싱글톤 패턴 코드 (*하나*의 객체를 공유한다)
	// 객체를 여러개 생성하는 것을 방지하는 패턴
	
	private static Company instance;
	private Company() { // private 생성자 --> 생성 제한(동일 클래스 내에서만 생성 가능)
		
	}
	public static Company getInstance() {
		if(instance==null)
			instance = new Company(); // Company instance --> 생성되지 않았다면 생성 
			return instance; // 생성되었다면 그대로 반환하고 진행
	}
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}

public class C03SingleTonPatternMain {
	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		com1.n1 =100; com1.n2 = 200;
		Company com2 = Company.getInstance();
		
		System.out.println(com2);
	
	}
}
