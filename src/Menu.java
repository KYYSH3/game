
public class Menu {

	public void getGameMenu(String Location, World World1, Player Player1, String a){
		if (Location.equals("�����")){	
			if (a.equals("h")){
				getHelp(World1.getStringLocation());	
			}
			if (a.equals("w")){
				Player1.walk(World1);
			}
			if (a.equals("l")){
				Player1.getPlayerLook(World1);
			}	
			if (a.equals("mar")){
				World1.setPlayerLocation("�����");
			}	
			if (a.equals("b")){
				Player1.PlayerHeal();
			}
		}
		if (Location.equals("�����")){
			if (a.equals("h")){
				getHelp(World1.getStringLocation());	
			}
			if (a.equals("q")){
				World1.setPlayerLocation("�����");	
			}
			if (a.equals("l")){
				Player1.getPlayerLook(World1);
			}	
			if (a.equals("b")){
				Player1.buyHealer();
			}
		}
		
	}
	

	public void getFightMenu(String b,Player Player1, Enemy Enemy1, World World1){
		if (b.equals("h")){
			getFightHelp();
		}
		if (b.equals("k")){
			Player1.DamageEnemy(Enemy1);
		   	Player1.getPlayerDamage(Enemy1);
		}
		if (b.equals("l")){
				Player1.getPlayerLook(World1);
		}
		if (b.equals("b")){
			Player1.PlayerHeal();
		}
	}
	
	public void getHelp(String Location){
		if (Location.equals("�����")){
			System.out.println(" �������:");
			System.out.println("   w - �����������");
			System.out.println("   l - ��������� ����");
			System.out.println("   h - ������� �������");
			System.out.println("   b - ������ ����");
			System.out.println("   mar - ����� �� �����");
			
		}
		if (Location.equals("�����")){
			System.out.println(" �������:");
			System.out.println("   h - ������� �������");
			System.out.println("   l - ��������� ����");
			System.out.println("   q - ����");	
		}
	}
	
	private void getFightHelp(){
		System.out.println(" �������:");
		System.out.println("   h - ������� �������");
		System.out.println("   l - ��������� ����");
		System.out.println("   k - ������� ����");	
		System.out.println("   b - ������ ����");	
	} 
	
}
