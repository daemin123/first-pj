package Ch12Ex;


abstract class Shape{
	int x;
	Shape(int x) {
		this.x=x;
	}
	void 넓이() {
		System.out.println();
	}
}
class Rectangle extends Shape{
	int width;
	int height;
	Rectangle(int x, int y) {
		super(x);
		this.height =y;
	}
	void 넓이() {
		System.out.println(x*height);
	}
	
}
class Triangle extends Shape{
	int height;
	int bottomLine;
	Triangle(int x, int y) {
		super(x);
		this.bottomLine=y;
	}
	void 넓이() {
		System.out.println(x*bottomLine*1/2);
	}
}
class Circle extends Shape{
	int radius;
	Circle(int x) {
		super(x);
		this.radius= x;
	}
	void 넓이() {
		double b = 3.14*radius*radius;
		System.out.println(b);
	}
}

public class C04Ex {

	public static void 전체넓이확인(Shape obj) {
//		if(obj instanceof Rectangle) {
//			Shape down = obj;
//			Rectangle ob = (Rectangle) down;
//			ob.넓이();
//		}
//		if (obj instanceof Triangle) {
//			Shape down = obj;
//			Triangle ob = (Triangle) down;
//			ob.넓이();
//		}
//		if (obj instanceof Circle) {
//			Shape down = obj;
//			Circle ob = (Circle) down;
//			ob.넓이();
//		}
		obj.넓이();
	}
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}