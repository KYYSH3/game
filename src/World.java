
public class World {
	private String PlayerLocation = "Улица";
	private String Loc0 = "Улица";
	private String Loc1 = "Магазин";
	
	public String getStringLocation(){
		return PlayerLocation;
	}
	
	public void getPlayerLocation(){
		System.out.println("Вы на локации: "+ PlayerLocation);
	}
}
