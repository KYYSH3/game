import java.util.Scanner;



public class Game {
	
	public String version = "build3";
	
	public void returnVersion(){
		
		System.out.println("Версия игры " + version);
	}
	
	public void start(){
		returnVersion();
		String a;
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
		while (Player1.Health != 0) {
			a=namescan.next();
			if (World1.getStringLocation().equals("Улица")){	
				if (a.equals("h")){
					getHelp(World1.getStringLocation());	
				}
				if (a.equals("w")){
					Player1.walk();
				}
				if (a.equals("l")){
					Player1.getPlayerLook(World1);
				}	
				if (a.equals("mar")){
					World1.setPlayerLocation("Рынок");
				}	
			}
			if (World1.getStringLocation().equals("Рынок")){
				if (a.equals("h")){
					getHelp(World1.getStringLocation());	
				}
				if (a.equals("b")){
					World1.setPlayerLocation("Улица");	
				}
				if (a.equals("l")){
					Player1.getPlayerLook(World1);
				}	
			}
		}
		namescan.close();
		System.out.print("Конец игры");
	}
	
	public void getHelp(String Loc){
		if (Loc.equals("Улица")){
			System.out.println(" Справка:");
			System.out.println("   w - прогуляться");
			System.out.println("   l - осмотреть себя");
			System.out.println("   h - вызвать справку");
			System.out.println("   mar - пойти на рынок");
		}
		if (Loc.equals("Рынок")){
			System.out.println(" Справка:");
			System.out.println("   h - вызвать справку");
			System.out.println("   l - осмотреть себя");
			System.out.println("   b - уйти");
		}
	}
}
