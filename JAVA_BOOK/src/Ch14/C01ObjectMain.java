package Ch14;

class A {
	int x;
	int y;
	@Override
	public String toString() {
		return "X = " + x + " Y = " + y;
	}
	
}

public class C01ObjectMain {
	
	
	public static void main(String[] args) {
		
		Object ob = new Object();
		System.out.println(ob);
		System.out.println(ob.toString());
		
		System.out.println();
		
		A ob2 = new A();
		ob2.x=2;
		ob2.y=3;
		System.out.println(ob2);
		System.out.println(ob2.toString());
		
	}
	
}
