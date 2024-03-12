package Ch07;

import java.util.*;

public class C00While_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		N - M 까지의 합을 구합니다.(N<M)
//		System.out.println("정수를 두개 입력하세요 :");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = 0;
//		while (n<=m) {
//			sum +=n ;
//			n++;
//		}
//		System.out.println("합은 : " + sum);
		
//		01 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
//		System.out.println("정수를 하나 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		if (n%2 == 0) {
//			while(i<=n/2) {
//				sum += 2*i;
//				i++;
//				
//			}
//		System.out.println(sum);
//		}
//		else {
//			while((2*i-1)<=n) {
//				sum += (2*i-1);
//				i++;
//			}
//			System.out.println(sum);
//		}
		
//		1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력
//		System.out.println("정수를 하나 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=n/3) {
//			System.out.println(3*i);
//			sum += 3*i;
//			i++;
//		}
//		System.out.println(sum);

//		1 - N까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요
//		System.out.println("정수를 하나 입력하세요 :");
//		int n = sc.nextInt();
//		int i = 0;
//		int sum1 = 0;
//		int sum2 = 0;
//		while(i<=n/4) {
//			System.out.println(4*i);
//			sum1 += 4*i;
//			i++;
//		}
//		i = 0;
//		while(i<=n) {
//			
//			sum2 += i;
//			i++;
//		}
//		System.out.println(sum2-sum1);
		
//		구구단 N 단 역순출력(N<=9)
//		System.out.println("9이하의 자연수를 하나 입력하세요 :");
//		int n = sc.nextInt();
//		int i;
//		for(i=9;i>=1;i--) {
//			System.out.printf("%d * %d = %d\n",n,i,n*i);
//		}
		
		
		//양의 정수를 입력받아서 소수인지 아닌지를 판별하는 코드를 작성하세요
//		System.out.println("양의 정수를 하나 입력하세요 : ");
//		int n = sc.nextInt();
//		int i;
//		for(i=2;i<n;i++) {
//			if(n%i != 0) {
//				System.out.println("소수입니다");
//			}
//			else {
//				System.out.println("소수가 아닙니다");
//			}
//		}
		
			//숫자를 입력받아 해당 수를 거꾸로 저장해서 출력해보세요
			//정수값을 입력받아서 처리합니다
			//입력 : 1234
			//출력 : 4321
//		System.out.println("수를 입력하세요 : ");
//		int n = sc.nextInt();
//			// 자리수 구하기
//		int digit = 0;
//		int tmp = n;
//		int result = 0;
//		while(tmp!=0) {
//			digit++;
//			tmp = tmp/10;
//		}
//		System.out.println("자리수확인 : " +digit);
//		while (n!=0) {
////			System.out.print(n%10);
//			result += (int)((n%10)*(Math.pow(10, digit-1)));
//			digit--;
//			n/=10;
//		}
//		System.out.println(result);
		
		

			// 이중 while문제.. 나중에 푸세요~~
			//자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 
			//10 미만의 홀수만 출력하시오.
			// 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
			//입력 : 3
			//출력 :
			//1 3 5
			//7 9 1
			//3 5 7
			
			
			//별찍기(그냥찍기/높이입력받아서 찍기)
//			높이 : 4
//			****
//			****
//			****
//			****
//		int n =sc.nextInt();
//		int i;
//		for(i=1;i<=n;i++) {
//		System.out.print("****\n");
//		}
//			
//			높이 : 4
//			*
//			**
//			***
//			****
//		int n = sc.nextInt();
//		int i=1;
//		for (i=1;i<=n;i++) {
//			for(int j =1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

//			
//			높이 : 4		
//			****		
//			***
//			**
//			*
		System.out.println("수를 하나 입력하세요 :");
//		int n = sc.nextInt();
//		int i=1;
//		for (i=n;i>=1;i--) {
//			for(int j =1;j<=i;j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

		
		
		
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<4) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++; 
//		}	
//			
		
		
		
		
		
//			높이 : 4		i(행)	j(공백)	k(별)		
//			   *	:	0		0~2		0~0 -1개
//			  ***	:	
//			 *****	:
//			*******	:
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		while(i<n) {
//			//공백
//			while(j<=(n-2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			j=0;
//			// 별
//			k=0;
//			while(k<=i*2) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		상위 조건식의 탈출변수가 i이고, i가 1씩 증가하는 증가식을 가지고 있으므로
//		하위 조건식에 변수 i가 들어가야 매 행마다 다른 값이 출력.
//		
//			
//			높이 : 4		
//			******* // 0	i
//			 *****  // 1 
//			  ***   // 2
//			   *    // 3
//		System.out.println("높이를 입력하세요");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i<n) {
//			j = 0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//
//			k = 0;
//			while(k<=2*n-2-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//			 
//			높이 : 7		
//			   *
//			  ***
//			 *****
//			*******	
//			 *****
//			  ***
//			   *
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		
//		while(i<=(n-1)/2) {
//			//공백
//			while(j<(n-1)/2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			j=0;
//			// 별
//			k=0;
//			while(k<i*2+1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		i=0;
//		k=0;
//		j=0;
//		while(i<=(n-1)/2-1) {
//			j = 0;
//			while(j<i+1) {
//				System.out.print(" ");
//				j++;
//			}
//			//
//			k = 0;
//			while(k<n-i) { // 조건 불만족
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		   높이 : 7
//			*******	   
//			 *****
//			  ***
//			   *
//		      ***
//			 *****
//			*******	
	}

}
