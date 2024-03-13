package Ch16;

class Person<T,S> {
	public T info;
	public S id;
	Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class C00Example {
	public static void main(String[] args) {
		Person a = new Person(5,3);
		Person<String,Integer> ob = new Person<String, Integer>("사람",21);
		Person<String, Character> ob3 = new Person<String,Character>("사람2",'a');
		Person<String,Double> ob1 = new Person<String, Double> ("사람1",21.1);
		Person b = new Person("정대민","몰라");
		System.out.println(b.id);
		System.out.println(b.info);
		System.out.println(ob3.info);
		System.out.println(ob3.id);
		System.out.println(ob.info);
		System.out.println(ob.id);
		
	}
}
