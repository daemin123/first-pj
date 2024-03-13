package Ch10;

import java.util.Arrays;

// 1차원 배열 : 해당 자료형을 요소 단위로 정한다

// 2차원 배열 : 1차원 배열을 요소 단위로 정한다
// int arr[][] = new int[2][3]; // 2행 3열
// 
public class C03ArrayMain {
	public static void main(String[] args) {
		int arr[][] = {
				{10,20,30},
				{40,50,60,65,67},
				{70,80,90,96,11,56},
				{100,110,120,15,22,33,44}
		};
		// 2차원 배열에서의 length는 행의 길이
		System.out.println("행의 길이 : " + arr.length);
		// 2차원 배열에서의 열의 길이
		System.out.println("[0]행의 열의 길이 " + arr[0].length);
		System.out.println("[1]행의 열의 길이 " + arr[1].length);
		System.out.println("[2]행의 열의 길이 " + arr[2].length);
		System.out.println("[3]행의 열의 길이 " + arr[3].length);
		
		for (int i = 0; i<arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
