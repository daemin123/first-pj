package Ch10;

class C04Person {
	String name;
	int age;
	
	public C04Person() {}
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}	
	
}

public class C04ClassArrayMain {
	
	// 클래스 자료형으로 배열을 생성하면
	// 참조 변수형으로 배열만 생성
	// 생성자가 없다는 의미
	// 생성자를 통해 객체를 생성해줘야
	// 클래스 자료형으로 들어간 요소들에 값이 설정
	public static void main(String[] args) {
	C04Person list[] = new C04Person[3]; 
	list[0] = new C04Person();
	list[0].name = "홍길동";
	list[0].age = 55;
	
	list[1] = new C04Person();
	list[1].name = "김영희";
	list[1].age = 35;
	
	list[2] = new C04Person();
	list[2].name = "김범수";
	list[2].age = 40;
	
	for(C04Person obj : list) {
		System.out.println(obj);
	}
	
	}
}
