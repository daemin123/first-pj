package Ch06EXEC;

import java.util.*;

public class problem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("세가지 정수를 입력하세요 : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int sum = a+b+c;
//		double avr = (double)sum/3;
//		System.out.println(sum);
//		System.out.println(avr);
//		
//		if (a>b && a>c) {
//			System.out.println("max = "+ a);
//			if (b>c) {
//				System.out.println("min = " + c);
//			}
//			else {
//				System.out.println("min = " + b);
//			}
//			
//		}
//		else if (b>a && b>c) {
//			System.out.println("max = " + b);
//			if (a>c) {
//				System.out.println("min = "+c);
//			}
//			else {
//				System.out.println("min = " + a);
//			}
//		}
//		else if (c>a && c>b){
//			System.out.println("max = " + c);
//			if (b>a) {
//				System.out.println("min = " + a);
//			}
//			else {
//				System.out.println("min = " + b);
//			}
//		}
//		else if (a==b || a==c || b==c) {
//			System.out.println("같은 수가 존재합니다.");
//		}
//		else {
//			System.out.println("잘못된 접근");
//		}
		System.out.println("네가지 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int sum = a+b+c+d;
		double avr = (double)sum/4;
		System.out.println(sum);
		System.out.println(avr);
		
		if (a>b && a>c && a>d) {
			System.out.println("max = " +a);
			
		}
		else if (b>a && b>c && b>d) {
			System.out.println("max = " +b);
		}
		else if (c>a && c>b && c>d) {
			System.out.println("max = " +c);
		}
		else if (d>a && d>b && d>c) {
			System.out.println("max = " +d);
		}
		else if( a==b || a==c || a==d || b==c || b==d || c==d) {
			System.out.println("같은 수가 존재");
	}
	else {
		System.out.println("잘못된 접근");
	}
}
}
