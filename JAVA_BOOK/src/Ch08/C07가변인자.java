package Ch08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class C07Simple{
	int sum(int ...arg) {

		int s=0;
		
		for(int n : arg) {
			System.out.println("인자 값 : " + n);
			s+=n;
		}
		return s;
	}

	
}
public class C07가변인자 {
	// 인자를 배열형태로 나열하면
	// 원하는 수만큼의 인자를 유동적으로 받아들일 수 있음
	// 배열 표현 방식은 (int ... arg)로 표현함
	// 인터페이스로 import java.util.Arrays;를 선언해줘야
	// 배열의 표현이 가능함.
	
	public static void main(String[] args) {
		C07Simple obj = new C07Simple();
//		obj.sum(10);System.out.println();
//		obj.sum(10,20);System.out.println();
//		obj.sum(10,20,30);System.out.println();
//		obj.sum(10,20,30,40);System.out.println();
		int r=obj.sum(10,20,30,40,50,60,70);System.out.println();
		System.out.println("합 : " + r);
	}

}
