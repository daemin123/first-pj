package Ch08;

class calc {
	double areaRectangle(double width) {
		return width*width;
	}
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
public class prac1 {
	public static void main(String[] args) {
		calc cal = new calc();
		double a = cal.areaRectangle(5);
		double b = cal.areaRectangle(5,10);
		
		System.out.println("정사각형의 넓이는" + a);
		System.out.println("직사각형의 넓이는" + b);
	}
}
