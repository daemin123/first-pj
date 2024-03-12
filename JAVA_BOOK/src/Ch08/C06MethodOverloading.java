package Ch08;

class C06Simple{
	String name;
	int sum(int x,int y) {
		System.out.println("sum(int,int)호출!");
		return x+y;
		}
	int sum(double x , double y) {
		System.out.println("sum(double,double)호출!");
		return (int)(x+y);
		}
	int sum(int x,int y,int z) {
		System.out.println("sum(int,int,int)호출!");
		return x+y+z;
		}
	int sum(String str1,int x,int y) {
		System.out.println("sum(String,int,int)호출!");
		name=str1;
		return x+y;
	}	
}

public class C06MethodOverloading {

	public static void main(String[] args) {
		// obj.sum()형태로 호출되는 함수이나,
		// 여러가지 형태로 받아들임
		// 입력된 인자의 형태에 따라서 다르게 받아들이거나
		// 인자의 개수에 따라 다르게 받아들임
		// 매 호출마다 형태가 달라질 경우에 다른 함수가 진행되는것을 말함
		// 함수의 명은 같음
		// 하나의 함수이나 여러가지 기능 보유 --> Overload!
		
		C06Simple obj = new C06Simple();
		int r1 = obj.sum(10, 20);
		System.out.println("r1 : " + r1);
		int r2 = obj.sum(10.2, 20.5);
		System.out.println("r2 : " + r2);
		int r3 = obj.sum(10,20,30);
		System.out.println("r3 : " + r3);
		int r4 = obj.sum("홍길동",20,30);
		System.out.println("r3 : " + r3);
		System.out.println(obj.name);
	}

}
