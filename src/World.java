
public class World {
	private String PlayerLocation = "�����";
	
	public String getStringLocation(){
		return PlayerLocation;
	}
	
	public void getPlayerLocation(){
		System.out.println("�� �� �������: "+ PlayerLocation);
	}
	
	public void setPlayerLocation(String Loc){
		PlayerLocation = Loc;
		getPlayerLocation();
	}
}
