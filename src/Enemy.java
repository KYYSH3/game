import java.util.Random;


public class Enemy {
	private int Health;
	public int Level;
	public String Class;
	
	public void newEnemyCreate(){
		float a;
		Random rand = new Random();
		a = rand.nextFloat();
		if (a > 0.5) {
			Class = "������";
			Health = 10;
			Level = 1; //Need to be corrected
		}
		else {
			Class = "����";
			Health = 10;
			Level = 2; //Need to be corrected
		}
	}
	public void getDamage(int damage){
		Health = Health - damage;
		System.out.println(Class + " ������� "+ damage + " �����");
		System.out.println("� " + Class + " �������� " + Health + " ��������");
	}
	public int getEnemyHealth(){
		return Health;
	}
	
}
