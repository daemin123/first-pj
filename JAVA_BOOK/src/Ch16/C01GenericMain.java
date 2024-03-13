package Ch16;


abstract class RealMaterial {
	
}

class 팥 extends RealMaterial{
	private String material;
	
	팥(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "팥 [material=" + material + "]";
	}
	
	
}

class 야채 extends RealMaterial{

	@Override
	public String toString() {
		return "야채 []";
	}
	
}

class 슈크림 extends RealMaterial{

	@Override
	public String toString() {
		return "슈크림 []";
	}
	
}

class 민트초코 {

	@Override
	public String toString() {
		return "민트초코 []";
	}
	
}

class 호빵 <T extends RealMaterial> {
	private T material;
	
	호빵(T material) {
		this.material = material;
	}
	void showInfo() {
		System.out.println(material+"으로 만든 호빵");
	}
}



// Generic 
// 받는 인자의 타입을 <>형식으로 표현해
// 인자를 자료형에 관계없이 받을 수 있다.
// 자료형을 객체 생성시에 결정하는 형식
// 클래스도 자료형이기에 인자로 넣을 수 있다.
// 상속(extends)을 통해 제네릭으로 올 수 있는 데이터를 제한 가능
// extends A --> A,A의 자식들만 데이터 타입으로 받는다.


public class C01GenericMain {
	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>(new 팥("단팥"));
		ob1.showInfo();
		
		호빵<야채> ob2 = new 호빵<야채>(new 야채());
		ob2.showInfo();
		
		호빵<슈크림> ob3 = new 호빵<슈크림>(new 슈크림());
		ob3.showInfo();
//		호빵<민트초코> ob4 = new 호빵<민트초코>(new 민트초코());
//		ob4.showInfo();
	}
}
