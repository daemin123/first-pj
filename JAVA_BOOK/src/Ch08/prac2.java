package Ch08;
import java.io.*;
import java.util.Scanner;

class key {
	String sentence;
	void change() {
		StringBuffer sen = new StringBuffer(this.sentence);
		sen.reverse();
		System.out.println(sen);
		
	}
}
public class prac2 {
	public static void main(String[] args) {
		key key = new key();
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요");
		key.sentence = sc.nextLine();
		key.change();
		
	}
}
