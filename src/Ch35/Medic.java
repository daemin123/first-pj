package Ch35;

public class Medic extends Unit{

	@Override
	void move() {
		System.out.println("Medic Move...");
	}
	
	@Override
	void underAttack(int damage) {
		
		if(this.hp-damage<0) 
		System.out.println("Medic UnderAttack...");
		else
			this.hp-=damage;
	}
	
}
