

import java.util.Scanner;



public class Game {
	
	public String version = "build10";  //Fixed and improved damage system (stable)
	
	public void returnVersion(){
		
		System.out.println("Версия игры " + version);
	}
	
	public void start(){
		returnVersion();
		String a, Location;
		Player Player1 = new Player();
		World World1 = new World();
		Scanner namescan = new Scanner(System.in);
		System.out.print("Загрузка игры");
		System.out.print(".");
		System.out.print(".");
		System.out.println(".");
		System.out.println("Введите имя игрока: ");
		Player1.setPlayerName(namescan.next());
		Player1.presetPlayerClass();
		Player1.setPlayerClass(namescan.next());
		System.out.println("Введите h чтобы увидеть список команд");
		Menu MainMenu = new Menu();
		while (Player1.Health > 0) {
			a=namescan.next();
			Location = World1.getStringLocation();
			MainMenu.getGameMenu(Location, World1, Player1, a);
		}
		namescan.close();
		System.out.print("Конец игры. Вы погибли.");
	}
	
}
