package Ch12Ex;
class Pen{
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
}
class SharpPen extends Pen{
	private int width;
}

class Ballpen extends Pen{
	private String color;
	public String getColor() {return color;}
	public void setColor(String color) {this.color=color;}
}
class FountainPen extends Ballpen{
	public void refill(int n) {setAmount(n);}
}
public class prac {
	public static void main(String[] args) {
		
		
	}
}
