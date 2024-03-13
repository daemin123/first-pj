package Ch13Ex;
class TV {
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() { return size;}
}

class ColorTV extends TV {
	int Color;
	ColorTV(int size, int Color) {
		super(size);
		this.Color = Color;
	}
	void printProperty() {
		System.out.println(this.getSize()+"인치" + this.Color+"컬러");
	}
}
class IPTV extends ColorTV {
	String ip;
	IPTV(String ip, int size, int Color){
		super(size,Color);
		this.ip = ip;
	}
	void printProperty() {
		System.out.println(this.ip+this.getSize()+this.Color);
	}
	
}
public class Ex {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();	
	}
		//명품자바 4장 클래스 기본
		//https://security-nanglam.tistory.com/212
		
		//명품자바 5장 상속
		//https://security-nanglam.tistory.com/215
}
