
package Ch11;
class C01Simple {
	static int num1;
		// C01Simple의 개체간의 공유되는 변수
		// 객체 생성과 무관하게 메모리공간 할당
		// 클래스 명으로 접근 가능
		// static --> 전역의 성질을 가짐 (전체 영역에 영향)
	
	int num2; 

	C01Simple() {
		this.num1 = 0;
		this.num2 = 0;
	}

	@Override
	public String toString() {
		return "C01Simple [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}
public class C01StaticMain {
	public static void main(String[] args) {
		
		C01Simple.num1 = 100; // 객체가 생성되지 않았는데도 num1은 static 전역 변수이기 때문에
							  // num1이라는 공간이 이미 형성되어 있음
		
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		ob1.num1 = 10; ob1.num2 = 20;
		System.out.println(ob1);
		System.out.println(ob2);
		ob2.num1 = 30; ob2.num2 = 40;
		System.out.println();
		System.out.println(ob1);
		System.out.println(ob2);
	}
}
