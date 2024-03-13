package Ch15;

// throws --> 던진 예외에 대하여 처리 로직을 실행 부분으로 다시 던진다
// 			  main함수에 관해서는 특이 케이스라 해당X
class A {
	public void Ex1() throws NullPointerException {
		throw new NullPointerException("NullException");
	}
}
class B {
	public void Ex2(A a) {
		try{
		a.Ex1();
		}catch(Exception e) {
			System.out.println("B.Ex2 Function's Exception..");
		}
	}
}
public class C05ThrowAndThrowsMain {
	

	public static void Ex2() {
		
	}
		
	public static void main(String[] args) {
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		
		A a = new A();
		B b = new B();
		b.Ex2(a);
		
		System.out.println("실행코드3");
	}
}
