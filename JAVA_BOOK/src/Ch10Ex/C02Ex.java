package Ch10Ex;

import java.util.Scanner;
import java.util.Arrays;
public class C02Ex {

	public static void main(String[] args) {
		//5 명의 학생에 국영수점수를 입력받아 2차원배열 저장
		//각 학생의 국영수 점수의 합/평균 구하고
		//각 과목당 합 /평균 구해보세요
		int arr[][]=new int[5][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국영수 점수 입력");
		arr[0][0] = sc.nextInt();
		arr[0][1] = sc.nextInt();
		arr[0][2] = sc.nextInt();
		System.out.println("국영수 점수 입력");
		arr[1][0] = sc.nextInt();
		arr[1][1] = sc.nextInt();
		arr[1][2] = sc.nextInt();
		System.out.println("국영수 점수 입력");
		arr[2][0] = sc.nextInt();
		arr[2][1] = sc.nextInt();
		arr[2][2] = sc.nextInt();
		System.out.println("국영수 점수 입력");
		arr[3][0] = sc.nextInt();
		arr[3][1] = sc.nextInt();
		arr[3][2] = sc.nextInt();
		System.out.println("국영수 점수 입력");
		arr[4][0] = sc.nextInt();
		arr[4][1] = sc.nextInt();
		arr[4][2] = sc.nextInt();
		
		System.out.println(Arrays.stream(arr[0]).average());
		System.out.println(Arrays.stream(arr[1]).average());
		System.out.println(Arrays.stream(arr[2]).average());
		System.out.println(Arrays.stream(arr[3]).average());
		System.out.println(Arrays.stream(arr[4]).average());
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for(int i = 0;i<arr.length;i++) {
			sum1+=arr[i][0];
			sum2+=arr[i][1];
			sum3+=arr[i][2];
		}
		System.out.println(sum1/5);
		System.out.println(sum2/5);
		System.out.println(sum3/5);
		
		
		
		
	}

}