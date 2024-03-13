package Ch12;

class C06Super {
	void func1() {System.out.println("C06Super Func1 호출!");}
	}

class C06Sub extends C06Super{
	void func1() {System.out.println("C06Sub Func1 호출!");}
	void func2() {System.out.println("C06Sub Func2 호출(extends..)!");}
}
public class C06UpDownCastingOverridingMain {
	public static void main(String[] args) {
//		C06Super ob1 = new C06Super();
//		ob1.func1();
//		C06Sub ob2 = new C06Sub();
//		ob2.func1();
		C06Super ob3 = new C06Sub();
		// UpCasting을 진행할 때 
		// 확장된 부분에 대해서는 접근이 불가능 (DownCasting을 하지 않았을 경우)
		// 하지만 오버라이딩되어 접근 가능한 부분에 함수가 재정의된 것은 접근이 가능함
		// Super Class에 func1이 있고 Sub Class에 func1이 있어
		// func1에 대하여 상속 관계에 있는 함수 재정의인 Overriding이 진행된 상태
		// func1은 Super Class에서도 접근이 가능하기에 자식 클래스인 Sub 클래스로
		// UpCast를 해도 사용하려는 func1은 공간의 확장이 필요가 없음.
		// 접근 가능
		// DownCasting 없이는 확장된 공간에 접근이 불가능함.
		
		
//		ob3.func2();	// UpCasting만 진행된 상태
		
		// UPCASTING
		// 상위 클래스형 참조 변수 = 하위 클래스형 객체
		// 확장된(추가된) 멤버 변수 접근 가능? X -> DOWNCASTING
		// 확장된(추가된) 멤버 메서드 접근 가능? X -> DOWNCASTING
		// 재정의된 멤버 메서드에 접근 가능? O
		ob3.func1();
		
	}
}
