import java.util.Scanner;



public class Game {
	
	public String version = "build2";
	
	public void returnVersion(){
		
		System.out.println("Версия игры " + version);
	}
	
	public void start(){
		returnVersion();
		String a;
		String h = "h";
		Player Player1 = new Player();
		Scanner namescan = new Scanner(System.in);
		System.out.print("Загрузка игры");
		System.out.print(".");
		System.out.print(".");
		System.out.println(".");
		System.out.println("Введите имя игрока: ");
		Player1.setPlayerName(namescan.next());
		//World NewWorld = new World();
		System.out.println("Введите h чтобы увидеть список команд");
		while (Player1.Health != 0) {
			//Player1.getPlayerHealth();
			//Player1.getPlayerDamage(1);
			//Player1.getPlayerName();
			a=namescan.next();
			if (a.equals("h")){
				getHelp();	
			}
			if (a.equals("d")){
				Player1.getPlayerDamage(1);
			}
			if (a.equals("l")){
				Player1.getPlayerLook();
			}	
		}
		namescan.close();
		System.out.print("Конец игры");
	}
	
	public void getHelp(){
		System.out.println(" Справка:");
		System.out.println("   d - ударить себя в лицо");
		System.out.println("   l - осмотреть себя");
		System.out.println("   h - вызвать справку");
	}
}
