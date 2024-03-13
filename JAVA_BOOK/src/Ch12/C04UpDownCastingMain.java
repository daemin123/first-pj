package Ch12;

class Super {
	int n1;
}

class Sub extends Super {
	int n2;
}

public class C04UpDownCastingMain {
	public static void main(String[] args) {
		
		// NoCasting
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;
		
		// UpCasting : 상위 클래스 참조 변수 = 하위 클래스 객체
		// UpCasting은 상위 클래스형으로 형변환을 하는 문법
		// UpCasting은 자동 형변환이 된다.
		// Why?
		// 다형성과 관련이 있다
		// 좀 더 공통적으로 할 수 있는 부분을 간단히 표현하기 위해
		Super ob3 = new Sub(); // 상위 클래스의 참조 변수로 하위 객체 연결
		ob3.n1 = 100;
		// ob3.n2 = 20; Super 상위 클래스로 UpCasting이 진행 되었기에
		// 				n1은 공간 설정이 되어 있다. 하지만 n2를 넣을 공간도 설정이 되어 있지만,
		// 			 	n2가 정의 X
		
		
		// DownCasting : 하위 클래스 참조 변수 = 상위 클래스형 객체
		// DownCasting은 UpCasting을 전제 조건으로 가짐
		// DownCasting은 하위 클래스형으로 형변환을 시도하는 문법
		// DownCasting은 강제 형변환을 한다
		
		// Why?
		// UpCasting을 진행하면서
		// ob4 객체는 n2에 대한 접근 권한이 사라짐.
		// 접근 권한이 사라진 것을 복구하기 위해
		// DownCasting을 통해 n2에 대한 접근 권한을 복구시킨다.
		Sub ob4 = (Sub) ob3;
		ob4.n1=100;
		ob4.n2=200;
		
		
		
	}
}
