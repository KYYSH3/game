import java.util.Random;


public class Enemy {
	private int Health;
	public int Level;
	public String Class;
	
	public void newEnemyCreate(Player player1){
		float a;
		Random rand = new Random();
		a = rand.nextFloat();
		setEnemyLevel(player1);
		if (a > 0.5) {
			Class = "������";
			Health = 10;
		}
		else {
			Class = "����";
			Health = 10;
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
	public void setEnemyHealth(int hp){
		Health=hp;
	}
	private void setEnemyLevel(Player player1){
		Level=(int) (player1.retPlayerLevel()+ ((Math.random()*6) - 3));
		if (Level<=0){
			Level = 1;
		}
	}
}
