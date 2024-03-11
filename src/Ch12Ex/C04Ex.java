package Ch12Ex;


class Shape{
	
}
class Rectangle{
	int width;
	int height;
}
class Triangle{
	int height;
	int bottomLine;
}
class Circle{
	int radius;
}

public class C04Ex {

	public void 전체넓이확인() {
		
	}
	public static void main(String[] args) {
		전체넓이확인(new Rectangle(45,45));
		전체넓이확인(new Triangle(100,20));
		전체넓이확인(new Circle(5));
	}
}
