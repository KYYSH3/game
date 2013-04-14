
public class Menu {

	public void getGameMenu(String Location, World World1, Player Player1, String a){
		if (Location.equals("Улица")){	
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
				World1.setPlayerLocation("Рынок");
			}	
			if (a.equals("b")){
				Player1.PlayerHeal();
			}
		}
		if (Location.equals("Рынок")){
			if (a.equals("h")){
				getHelp(World1.getStringLocation());	
			}
			if (a.equals("q")){
				World1.setPlayerLocation("Улица");	
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
		if (Location.equals("Улица")){
			System.out.println(" Справка:");
			System.out.println("   w - прогуляться");
			System.out.println("   l - осмотреть себя");
			System.out.println("   h - вызвать справку");
			System.out.println("   b - выпить пива");
			System.out.println("   mar - пойти на рынок");
			
		}
		if (Location.equals("Рынок")){
			System.out.println(" Справка:");
			System.out.println("   h - вызвать справку");
			System.out.println("   l - осмотреть себя");
			System.out.println("   q - уйти");	
		}
	}
	
	private void getFightHelp(){
		System.out.println(" Справка:");
		System.out.println("   h - вызвать справку");
		System.out.println("   l - осмотреть себя");
		System.out.println("   k - нанести удар");	
		System.out.println("   b - выпить пива");	
	} 
	
}
