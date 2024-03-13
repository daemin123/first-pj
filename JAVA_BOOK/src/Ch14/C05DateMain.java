package Ch14;

import java.util.Calendar;
import java.util.Date;
// import java.sql.Date; --> DB연결 Date
public class C05DateMain {
	public static void main(String[] args) {
// 잘 사용하지 않음 --> 메모리 동적 할당에 의한 메모리 과다 사용에 의해 비효율적
//		Date d1 = new Date();
//		System.out.println(d1);
//		System.out.println(d1.getYear());
//		System.out.println(d1.getMonth()+1); // 0부터 시작 -> +1 해줘야함
//		System.out.println(d1.getDay()); // 요일 정보 (0 - 6) 일-토
//		System.out.println(d1.getHours());
//		System.out.println(d1.getMinutes());
//		System.out.println(d1.getSeconds());
//		System.out.println(d1.getTime());
		
		Calendar Cal = Calendar.getInstance();
		System.out.println(Cal);
		System.out.println(Cal.get(Calendar.YEAR));
		System.out.println(Cal.get(Calendar.MONTH)+1); // 마찬가지로 0부터 시작 +1은 필수.
		System.out.println(Cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(Cal.get(Calendar.DAY_OF_WEEK)); // 1부터 시작 7까지 --> 일요일==1
		System.out.println(Cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(Cal.get(Calendar.MINUTE));
		System.out.println(Cal.get(Calendar.SECOND));
		
		
		
		
		
	}
}
