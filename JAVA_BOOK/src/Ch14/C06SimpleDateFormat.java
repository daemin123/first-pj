package Ch14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C06SimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("YYYY/MM/DD 입력 : ");
		String ymd = sc.next();
		
		// Formatter 객체 생성 (입력용)
		SimpleDateFormat fmtin = new SimpleDateFormat("yyyy/MM/dd");
										// 소문자가 기본이나 m은 Month,Minute 구분을 위해
										// 대문자 M은 Month로, 소문자 m은 Minute으로 한다
		System.out.println(ymd);
		Date date = fmtin.parse(ymd);
		System.out.println(date);
		
		// Formatter 객체 생성 (출력용)
		SimpleDateFormat fmtout = new SimpleDateFormat("yyyy~MM~dd");
		System.out.println(fmtout.format(date));
		
	}
}
