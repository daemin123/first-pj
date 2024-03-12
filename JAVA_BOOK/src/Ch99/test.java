package Ch99;


// 구매자
class Buyer { // Buyer 클래스 영역 생성
	private int myMoney; // 구매자의 가지고 있는 금액의 자료형 선언
	private int appleCnt; // 구매자가 가지고 있는 사과 개수의 자료형 선언
	Buyer(int money, int cnt){ // 생성자 함수(반환 자료형 X)
		this.myMoney = money; // Buyer의 myMoney에 money의 값 삽입
		this.appleCnt = cnt; // Buyer의 appleCnt에 cnt의 값 삽입
	}
	
	public void pay(Seller seller, int money) { // Buyer 클래스의 pay 함수 생성
		// 1 myMoney에서 money만큼 차감.
			myMoney -= money; // 구매한 사과만큼의 가격을 myMoney에서 차감
		// 2 seller의 receive메서드를 이용해서 money를 전달
			int cnt = seller.receive(money); // seller에게 money를 전달하고 사과개수를 반환받기 위한 함수실행
		// 6 사과개수를 받아 appleCnt 누적
			appleCnt += cnt; // 반환받은 cnt를 appleCnt에 대입 
			
	}
	void showinfo() { // 정보를 보여주는 showinfo()함수 생성
		System.out.println("보유금액 : " + this.myMoney); // this.myMoney로 현재 가지고 있는 buyer의 myMoney값을 추출하고 출력
		System.out.println("사과개수 : " + this.appleCnt); // this.appleCnt로 현재 가지고 있는 buyer의 appleCnt값을 추출하고 출력
	}
}
// 판매자
class Seller { // 판매자 클래스 영역 생성
	private int myMoney; // 판매자의 가지고 있는 금액의 자료형 선언
	private int appleCnt; // 판매자가 가지고 있는 사과 개수의 자료형 선언
	public int price; // 판매자가 판매하는 사과의 개당 가격의 자료형 선언
	Seller(int money, int cnt, int price){ // 생성자 함수
		this.myMoney = money; // 생성된 Seller의 money를 myMoney로 받는다
		this.appleCnt = cnt; // 생성된 Seller의 cnt를 appleCnt로 받는다
		this.price = price; // 생성된 Seller의 price를 price로 받는다
	}
	public int receive(int money) { // 판매한 금액을 받는 것과, 판매한 사과 개수만큼의 차감을 반환하는 함수 생성
		// 3 myMoney에 전달받은 money를 누적
		myMoney += money;
		// 4 보유사과개수(appleCnt)에 전달받은 money/price 차감
		int cnt = money/price; // 사과 개수를 받기 위한 cnt 선언(money/price값)
		appleCnt -= cnt; // 판매한 사과 개수 만큼 차감
		// 5 호출했던 위치(구매자의 pay함수)로 money/price 전달
		return cnt; // 판매한 사과 개수 반환 --> buyer가 반환받는 값
	}
	void showinfo() { // seller의 정보를 나타내는 함수 생성
		System.out.println("보유금액 : " + this.myMoney); // 보유금액 현행을 출력하는 출력문
		System.out.println("사과개수 : " + this.appleCnt); // 보유한 사과개수의 현행을 출력하는 출력문
		System.out.println("사과가격 : " + this.price); // 판매하고 있는 사과의 개당 금액을 출력하는 출력문
	}
	
}



public class test {

	public static void main(String[] args) { // 메인함수 영역 선언
		Seller seller01 = new Seller(100000,100,1000); // seller01 객체 생성
		// 보유금액, 사과개수, 사과 개당 가격
		Buyer buyer01 = new Buyer(10000, 0); // buyer01 객체 생성
		Buyer buyer02 = new Buyer(10000, 0); // buyer02 객체 생성
		Buyer buyer03 = new Buyer(30000, 0); // buyer03 객체 생성
		
		
		buyer01.pay(seller01, 2000); // buyer01 객체의 pay함수 실행(누구에게 지불할것인가, 얼마를)
		buyer02.pay(seller01, 5000); // buyer02 객체의 pay함수 실행(누구에게 지불할것인가, 얼마를)
		buyer03.pay(seller01, 3000); // buyer03 객체의 pay함수 실행(누구에게 지불할것인가, 얼마를)
		System.out.println("---판매자 정보---");
		seller01.showinfo(); // 사과를 판매하고 난 후 seller01에 대한 showinfo()함수 실행
		System.out.println("---구매자 정보---");
		System.out.println("-buyer01-"); 
		buyer01.showinfo(); // 사과를 구매하고 난 후 buyer01에 대한 showinfo()함수 실행
		System.out.println("-buyer02-");
		buyer02.showinfo(); // 사과를 구매하고 난 후 buyer02에 대한 showinfo()함수 실행
		System.out.println("-buyer03-");
		buyer03.showinfo(); // 사과를 구매하고 난 후 buyer03에 대한 showinfo()함수 실행
		
	}

}

