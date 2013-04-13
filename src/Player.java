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
	public void getPlayerLook(World getworld){
		getworld.getPlayerLocation();
		System.out.println(Name + ", " + Class);
		getPlayerHealth();
		getPlayerXp_Level();
	}
	
	private void getPlayerHealth(){
		System.out.println("� ��� " + Health + " ��������");
	}
	
	public void getPlayerDamage(Enemy Enemy1) {
		long damage;
		damage = Enemy1.Level / Level;
		Health = Health - (int) damage;
		System.out.println(Enemy1.Class + " ����� ��� " + damage + "�����.");
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
	private void getPlayerXp_Level(){
		System.out.println("� ��� " + Xp + " �����");
		System.out.println("������������ �� ������ " + XpLevelMax + " �����");
		System.out.println("��� �������: " + Level);
		System.out.println("� ��� " + Money + " ������");
		System.out.println("���� ����: " + Strenght);
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
			Enemy1.newEnemyCreate();
			System.out.println("��� ��������� ���� "+ Enemy1.Class + " " + Enemy1.Level + "-�� ������");
			System.out.println("������� h ��� ������ � ���");
			while (Enemy1.getEnemyHealth()>0&Health>0){
				if (Health<=0){
					Enemy1.setEnemyHealth(0);
				}
				Scanner comscan = new Scanner(System.in);
				b=comscan.next();
				if (b.equals("h")){
					getFightHelp();
				}
				if (b.equals("k")){
					DamageEnemy(Enemy1);
				   	getPlayerDamage(Enemy1);
				}
				if (b.equals("l")){
						this.getPlayerLook(World1);
				}
				if (b.equals("b")){
					PlayerHeal();
				}
			}
			if (Health>0){
				if (Enemy1.getEnemyHealth()<=0){
					System.out.println(Enemy1.Class + " ����.");
					increaseXp(3);
				}
			}
			
		}
	}
	
	public void DamageEnemy(Enemy Enemy1){
		long Damage;	
		int RealDamage;
		Damage=(Enemy1.Level / Level * Strenght / 10);
		RealDamage = (int) Damage;
		Enemy1.getDamage(RealDamage);
	}
	
	private void getFightHelp(){
		System.out.println(" �������:");
		System.out.println("   h - ������� �������");
		System.out.println("   l - ��������� ����");
		System.out.println("   k - ������� ����");	
		System.out.println("   b - ������ ����");	
	} 
	
	public void PlayerHeal(){
		if (Healer > 0){		
		Healer = Healer - 0.5;
		Health = Health + 5;
			if (Health > HealthMax) {
				Health = HealthMax;
			}
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
