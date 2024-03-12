package Ch08;

class Rectangle {
	double width;
	double height;
	void area() {
		System.out.println("사각형의 면적은" + this.width*this.height + "입니다");
	}
}
public class prac3 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.width = 5;
		rec.height = 11.1;
		rec.area();
	}
}
