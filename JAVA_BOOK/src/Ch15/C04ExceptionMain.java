package Ch15;

public class C04ExceptionMain {
	
	public static void main(String[] args) {
		try {
			String str = null;
//			str.toString(); // Null 예외 발생
			int arr[] = {10,20,30};
//			arr[5] = 100; // ArrayBound Exception 발생
//			Integer.parseInt("a1234"); // Parse Exception 발생
			Animal animal = new Dog();
			Cat yummi = (Cat) animal; // Cast Exception	
			
			
//		}catch(NullPointerException e) {
//			System.out.println("Null 예외 발생 처리..");
//		}catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println("ArrayBound 예외 발생 처리..");
//		}catch(NumberFormatException e3) {
//			System.out.println("Parse 예외발생 처리");
//		}catch(ClassCastException e4) {
//			System.out.println("Cast 예외 발생 처리");
//		}
		}catch(Exception e) { // UpCasting을 통해 Exception 안에 있는
							  // 모든 예외처리 가능.
			System.out.println(e);
		}finally {
			System.out.println("무조건 실행되는 코드");
		}
	}
}
