package Ch02;

public class C08ETC {

	public static void main(String[] args) {
		byte a = 'a';
		byte b = 'b';
		short c = 'ㄱ';
		char d = '가';
		int e = 44032;
		
		// 정수의 기본 자료형은 int
		// 실수의 기본 자료형은 double
		
		System.out.println((int)'ㄱ');
		System.out.println(c);
		System.out.println((int)d);
		System.out.println((char)e);
		System.out.printf("%d\n",0x3131);
		System.out.printf("%c\n",(char)0b0011000100110001);
		String var = "나의직업은 \"개발자\" 입니다.";
		System.out.println(var);
	}

}
