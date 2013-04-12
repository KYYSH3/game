
import java.awt.Event;

public class Player {
	private String Name;
	public int Health = 10;
	private long Xp = 0;
	private long XpLevelMax = 10;
	private long Level = 1;
	private String Class;
	
	public void setPlayerName(String namestr){
		Name=namestr;
	}
	public void getPlayerLook(){
		System.out.println("Имя игрока: " + Name);
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
		System.out.println("У вас " + Xp + " опыта.");
		System.out.println("Максиимально на уровне " + XpLevelMax + " опыта.");
		System.out.println("Ваш уровень: " + Level);
	}
}
