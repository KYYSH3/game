import java.util.Scanner;



public class Game {
	
	public String version = "build3_pre";
	
	public void returnVersion(){
		
		System.out.println("������ ���� " + version);
	}
	
	public void start(){
		returnVersion();
		String a;
		String h = "h";
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
			if (a.equals("h")){
				getHelp();	
			}
			if (a.equals("d")){
				Player1.getPlayerDamage(1);
			}
			if (a.equals("l")){
				Player1.getPlayerLook(World1);
			}	
		}
		namescan.close();
		System.out.print("����� ����");
	}
	
	public void getHelp(){
		System.out.println(" �������:");
		System.out.println("   d - ������� ���� � ����");
		System.out.println("   l - ��������� ����");
		System.out.println("   h - ������� �������");
	}
}
