package Ch12Ex;
import java.util.Scanner;
// 백준 1010번 다리놓기
public class bakjoon {

	public static int factorial(int b) {
		int v = 1;
		int j;
			for(j = 1; j<=b;j++) {
				v *= j;
			}
			return v;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 반복 할래요?");
		int a =sc.nextInt();
		int k = 0;
		for (int i =1; i<=a;i++) {
			System.out.println("다리를 만들기 위한 n,m 입력");
			int b = sc.nextInt();
			int c = sc.nextInt();
			k=factorial(b)/factorial(c)/factorial(b-c);
			System.out.println(k);
		}
		
	}

}
