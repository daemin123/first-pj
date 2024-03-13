package Ch12Ex;

abstract class OddDetector {
	protected int n;
	public OddDetector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd(); // 홀수면 리턴
}
public class B extends OddDetector{
	public B(int n) {
		super(n);
	}
}

public class prac4 {
	public static void main(String[] args) {
		
	}
}
