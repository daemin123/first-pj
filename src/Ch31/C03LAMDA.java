package Ch31;

// 덧셈, 뺄셈, 곱셈, 나눗셈을 수행하는 함수형 인터페이스 정의
interface Calculator {
	int calcualte(int num1, int num2);
}

public class C03LAMDA {

	public static void main(String[] args) {
		
		Calculator addition = (num1, num2) -> num1 + num2;
		System.out.println("Addition : " + addition.calcualte(5, 3));
		
		Calculator subtraction = (num1, num2) -> num1 - num2;
		System.out.println("Subtraction : " + subtraction.calcualte(5, 3));
		
		Calculator multiplication = (num1, num2) -> num1 * num2;
		System.out.println("Multiplication : " + multiplication.calcualte(5, 3));
		
		Calculator division = (num1, num2) -> {
			if (num2 == 0) return 0; // 0으로 나누기 방지
			return num1 / num2;
		};
		System.out.println("Division: " + division.calcualte(5, 3));
	}
	
}
