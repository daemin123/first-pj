package Ch07;

public class C00While_test2 {

	public static void main(String[] args) {
		
		//구구단 출력(2단-9단)

//		int dan=2;
//		int i;
//		while(dan<=9) {
//			
//			i=1;
//			while(i<=9) {
//				
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//	
//		}
//		//구구단 출력(9단 - 2단)
//		int dan=9;
//		int i;
//		while(dan>=2) {
//			
//			i=9;
//			while(i>=1) {
//				
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//	
//		}
		
		//구구단 출력(2단 - N단)
		//N은 Scanner로 받습니다.
		int dan=9;
		int i;
		while(dan>=2) {
			
			i=9;
			while(i>=1) {
				
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				i--;
			}
			System.out.println();
			dan--;
	
		}	
		
	}

}
