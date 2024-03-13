package Ch11Ex;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
import java.util.Arrays;
import java.util.stream.Stream;

class ArrayUtils {
//	   public static int[] concat(int[] a, int[] b) {
//	            /* 배열 a와 b를 연결한 새로운 배열 리턴 */
//		   		
//	   }
	   
	}

public class C01Ex {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
	      Integer [] array1 = {1, 5, 7, 9};
	      Integer [] array2 = {3, 6, -1, 100, 77};
	      Integer [] array3 = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(Integer []::new);
	      System.out.println(Arrays.toString(array3));
	      
//	      int[] array3 = ArrayUtils.concat(array1, array2);
//	      ArrayUtils.print(array3);
	}
}