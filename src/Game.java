import java.util.Scanner;



public class Game {
	
	public String version = "build3";
	
	public void returnVersion(){
		
		System.out.println("������ ���� " + version);
	}
	
	public void start(){
		returnVersion();
		String a;
		Player Player1 = new Player();
		World World1 = new World();
		Scanner namescan = new Scanner(System.in);
		System.out.print("�������� ����");
		System.out.print(".");
		System.out.print(".");
		System.out.println(".");
		System.out.println("������� ��� ������: ");
		Player1.setPlayerName(namescan.next());
		Player1.presetPlayerClass();
		Player1.setPlayerClass(namescan.next());
		System.out.println("������� h ����� ������� ������ ������");
		while (Player1.Health != 0) {
			a=namescan.next();
			if (World1.getStringLocation().equals("�����")){	
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
					World1.setPlayerLocation("�����");
				}	
			}
			if (World1.getStringLocation().equals("�����")){
				if (a.equals("h")){
					getHelp(World1.getStringLocation());	
				}
				if (a.equals("b")){
					World1.setPlayerLocation("�����");	
				}
				if (a.equals("l")){
					Player1.getPlayerLook(World1);
				}	
			}
		}
		namescan.close();
		System.out.print("����� ����");
	}
	
	public void getHelp(String Loc){
		if (Loc.equals("�����")){
			System.out.println(" �������:");
			System.out.println("   w - �����������");
			System.out.println("   l - ��������� ����");
			System.out.println("   h - ������� �������");
			System.out.println("   mar - ����� �� �����");
		}
		if (Loc.equals("�����")){
			System.out.println(" �������:");
			System.out.println("   h - ������� �������");
			System.out.println("   l - ��������� ����");
			System.out.println("   b - ����");
		}
	}
}
