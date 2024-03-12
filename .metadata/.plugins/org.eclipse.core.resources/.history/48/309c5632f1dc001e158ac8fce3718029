package Ch12;

class Point2D {
	int x;
	int y;
	
	Point2D() {
		System.out.println("Point2D() 생성자 호출!");
	}
	Point2D(int x) {
		this.x = x;
		System.out.println("Point2D(int x) 생성자 호출!");
	}
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(int x, int y) 생성자 호출!");
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
}
class Point3D extends Point2D {
	int z;
	
	Point3D() {
		super();  // 상위클래스 Point2D() 생성자 호출
		System.out.println("Point3D() 생성자 호출!");
	}
	Point3D(int x) {
		super(x); // 상위클래스 Point2D(int x) 생성자 호출
		System.out.println("Point3D(int x) 생성자 호출!");
	}
	Point3D(int x,int y) {
		super(x,y); // 상위클래스 Point2D(int x, int y) 생성자 호출
		System.out.println("Point3D(int x, int y) 생성자 호출!");
	}
	Point3D(int x, int y, int z) {
		super(x,y); // 상위클래스 Point2D(int x, int y) 생성자 호출
		this.z = z;
		System.out.println("Point3D(int x, int y, int z) 생성자 호출!");
	}
	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
}


public class C02InheritanceMain {
	public static void main(String[] args) {
		Point3D ob = new Point3D(); // 상위/부모 클래스가 먼저 공간 정의 및 생성되고 호출된 후 하위 클래스 생성 진행
		System.out.println();
		Point3D ob1 = new Point3D(10);
		System.out.println();
		Point3D ob2 = new Point3D(10,20);
		System.out.println();
		Point3D ob3 = new Point3D(10,20,30);
		System.out.println();
		ob.x = 100; 
		ob.y = 200;
		ob.z = 300;
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
}
