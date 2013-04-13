
public class World {
	private String PlayerLocation = "Улица";
	
	public String getStringLocation(){
		return PlayerLocation;
	}
	
	public void getPlayerLocation(){
		System.out.println("Вы на локации: "+ PlayerLocation);
	}
	
	public void setPlayerLocation(String Loc){
		PlayerLocation = Loc;
		getPlayerLocation();
	}
}
