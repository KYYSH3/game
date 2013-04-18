import java.util.Random;
import java.util.Scanner;


public class Player {
	private String Name;
	public int Health = 10;
	public int HealthMax = 10;
	private long Xp = 0;
	private long XpLevelMax = 10;
	private long Level = 1;
	private long Money = 30;
	private String Class;
	private int Strenght;
	private double Healer = 0.5;
	
	public void setPlayerName(String namestr){
		Name=namestr;
	}
	
	public long retPlayerLevel(){
		return Level;
	}
	
	public void getPlayerLook(World getworld){
		getworld.getPlayerLocation();
		System.out.println(Name + ", " + Class);
		System.out.println("HP: " + Health + "\\" + HealthMax + ". XP: "+ Xp + "\\" + XpLevelMax + ". LV: " + Level);
		System.out.println("STR: " + Strenght);
		System.out.println("� ��� " + Money + " ������; " + Healer + " ������ ����");
	}
	
	public void getPlayerDamage(Enemy Enemy1) {
		long damage;
		damage = Enemy1.Level / Level;
		Health = Health - (int) damage;
		System.out.println(Enemy1.Class + " ����� ��� " + damage + " �����.");
		System.out.println("� ��� �������� " + Health + " ��������.");
	}
	
	public void increaseXp(long xp){
		Xp = Xp + xp;
		increaseLevel();
	}

	private void increaseLevel(){
		while(Xp > XpLevelMax) {
			Xp = Xp - XpLevelMax;
			XpLevelMax = XpLevelMax + (Level * 3);
			Level = Level + 1;
			System.out.println("�� �������� ������� " + Level);
		}
	}
	
	public long getlongPlayerMoney(){
		return Money;
	}
	
	public void presetPlayerClass(){
		System.out.println("�������� �����:");
		System.out.println("   1)�������");
		System.out.println("   2)��������");
	}
	
	public void setPlayerClass(String choice){
		if (choice.equals("1")){
			Class = "�������";
			Strenght = 10;
		}
		if (choice.equals("2")){
			Class = "��������";
			Strenght = 15;
		}
		else {
			Class = "�������";
			Strenght = 10;
		}
	}
	public void walk(World World1){
		String b;
		Random r = new Random();
		Float a = r.nextFloat();
		if (a > 0.7) {
			System.out.println("�� ������ �� ��������� ");
		}
		else {
			Enemy Enemy1 = new Enemy();
			Menu Menu2 = new Menu();
			Enemy1.newEnemyCreate(this);
			System.out.println("��� ��������� ���� "+ Enemy1.Class + " " + Enemy1.Level + "-�� ������");
			System.out.println("������� h ��� ������ � ���");
			while (Enemy1.getEnemyHealth()>0&Health>0){
				if (Health<=0){
					Enemy1.setEnemyHealth(0);
				}
				Scanner comscan = new Scanner(System.in);
				b=comscan.next();
				Menu2.getFightMenu(b, this, Enemy1, World1);
			}
			if (Health>0){
				if (Enemy1.getEnemyHealth()<=0){
					System.out.println(Enemy1.Class + " ����.");
					increaseXp(3);
					getMoney();
				}
			}
			
		}
	}
	
	public void getMoney(){
		int max, addMoney;
		max = 10;
		addMoney = (int) (Math.random() * max);
		if (addMoney!=0) {
			System.out.println("�� ������� " + addMoney + " ������");
			Money = Money + addMoney;
		}
	}
	
	public void DamageEnemy(Enemy Enemy1){
		long Damage;	
		int RealDamage;
		Damage=(Enemy1.Level / Level * Strenght / 10);
		RealDamage = (int) Damage;
		Enemy1.getDamage(RealDamage);
	}
	

	
	public void PlayerHeal(){
		if (Healer > 0){		
		Healer = Healer - 0.5;
		Health = Health + 5;
			if (Health > HealthMax) {
				Health = HealthMax;
			}
			System.out.println("� ��� �������� " + Healer  + " �. ����");
		}
		else {
			System.out.println("� ��� �� �������� ����");
		}
	}
	
	public void buyHealer(){
		if (Money >= 5){
			Money = Money - 5;
			Healer = Healer + 0.5;
			System.out.println("�� ������ 0.5� ����");
		}
		else {
			System.out.println("��������� �����!");
		}
	}
}
