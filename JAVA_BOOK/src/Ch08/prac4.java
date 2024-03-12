package Ch08;
import java.io.*;

public class prac4 {
	public static void main(String[] args) {
		String a = "Java Programming Very Good";
		String b = "Java Programming";
		if(a.compareTo(b)>0) {
			System.out.println(a+"가" + b + "보다 큽니다");
		}
		else if (a.compareTo(b)==0) {
			System.out.println("크기가 같습니다.");
		}
		else {
			System.out.println(b+"가 더 큽니다");
		}
		int temp = a.compareTo(b);
		System.out.println(temp);
	}
}
