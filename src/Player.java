import java.util.Random;


public class Player {
	private String Name;
	public int Health = 10;
	private long Xp = 0;
	private long XpLevelMax = 10;
	private long Level = 1;
	private long Money = 30;
	private String Class;
	private int Strenght;
	
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
		System.out.println("У вас " + Health + " здоровья");
	}
	
	public void getPlayerDamage(int damage) {
		Health = Health - damage;
		System.out.println("Вы ударили себя по лицу");
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
			System.out.println("Вы получили уровень " + Level);
		}
	}
	private void getPlayerXp_Level(){
		System.out.println("У вас " + Xp + " опыта");
		System.out.println("Максиимально на уровне " + XpLevelMax + " опыта");
		System.out.println("Ваш уровень: " + Level);
		System.out.println("У вас " + Money + " рублей");
		System.out.println("Ваша сила: " + Strenght);
	}
	
	public long getlongPlayerMoney(){
		return Money;
	}
	
	public void presetPlayerClass(){
		System.out.println("Выберите класс:");
		System.out.println("   1)Студент");
		System.out.println("   2)Аспирант");
	}
	
	public void setPlayerClass(String choice){
		if (choice.equals("1")){
			Class = "Студент";
			Strenght = 10;
		}
		if (choice.equals("2")){
			Class = "Аспирант";
			Strenght = 15;
		}
		else {
			Class = "Студент";
			Strenght = 10;
		}
	}
	public void walk(){
		Random r = new Random();
		Float a = r.nextFloat();
		if (a > 0.7) {
			System.out.println("Вы никого не встретили ");
		}
		else {
			Enemy Enemy1 = new Enemy();
			Enemy1.newEnemyCreate();
			System.out.println("Вам навстерчу идет "+ Enemy1.Class + " " + Enemy1.Level + "-го уровня");
			while (Enemy1.getEnemyHealth()>0){
				DamageEnemy(Enemy1);
			}
			if (Enemy1.getEnemyHealth()<=0){
				System.out.println(Enemy1.Class + " умер.");
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
	
}
