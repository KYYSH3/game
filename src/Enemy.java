import java.util.Random;


public class Enemy {
	public int Health;
	public int Level;
	public String Class;
	
	public void newEnemyCreate(){
		float a;
		Random rand = new Random();
		a = rand.nextFloat();
		if (a > 0.5) {
			Class = "Гопник";
			Health = 10;
			Level = 1; //Need to be corrected
		}
		else {
			Class = "Мент";
			Health = 10;
			Level = 2; //Need to be corrected
		}
	}
}
