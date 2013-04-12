
public class Player {
	private String Name;
	public int Health = 10;
	private long Xp = 0;
	private long XpLevelMax = 10;
	private long Level = 1;
	private long Money = 30;
	private String Class;
	
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
	
	public void getPlayerDamage(int damage) {
		Health = Health - damage;
		System.out.println("�� ������� ���� �� ����");
		getPlayerHealth();
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
		}
		if (choice.equals("2")){
			Class = "��������";
		}
		else {
			Class = "�������";
		}
	}
	public void walk(){
		System.out.println("�� ������ �� ���������");
	}
}
