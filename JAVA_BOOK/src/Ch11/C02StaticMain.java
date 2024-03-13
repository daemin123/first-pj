package Ch11;

class C02Simple {
	int n1;
	static int n2;
	
	void func1() {
		n1 = 10;
		n2 = 20;
	}
	static void func2() {
//		n1 = 400; // static으로 정의된 함수 func2()는 전역 함수이기에 미리 함수가 선언되어 있음
				  // 하지만 n1은 객체가 선언되어야 같이 선언되는 변수이기에 n1의 공간이 정의되어 있지 않다
				  // static함수 내부의 변수는 static 변수로 사용해야 함.
		n2 = 30;
		
	}
}
public class C02StaticMain {
	public static void main(String[] args) {
		
	}
}
