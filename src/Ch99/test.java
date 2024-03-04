package Ch99;


class Buyer
{
	int myMoney;
	int appleCnt;
	Buyer(int money,int cnt){
		this.myMoney = money;
		this.appleCnt = cnt;
	}
	
	public void pay(Seller seller, int money) {
		myMoney-=money; 					// 1 내 myMoney에서 money만큼 차감
		int cnt=seller.receive(money);		// 2 seller의 receive메서드를 이용해서 money를 전달
		appleCnt+=cnt;						// 6 사과개수를 받아 appleCnt 누적		
	}

	
}
class Seller
{
	int myMoney;
	int appleCnt;
	public int price;
	Seller(int money,int cnt,int price){
		this.myMoney = money;
		this.appleCnt=cnt;
		this.price = price;
	}
	public int receive(int money) {
		myMoney+=money;			
		int cnt=money/price;
		appleCnt-=cnt;			
		return cnt;				
	};
	
}

public class test {
	
	public static void main(String[] args) {
		Buyer buyer01 = new Buyer(10000,0);
//		Buyer buyer02 = new Buyer(10000,0);
		
		Seller seller01 = new Seller(100000,100,1000);
		
		buyer01.pay(seller01,3000);
		
		System.out.printf("%d,%d\n",buyer01.myMoney,buyer01.appleCnt );
		System.out.printf("%d,%d\n",seller01.myMoney,seller01.appleCnt );
		
	}

}

















