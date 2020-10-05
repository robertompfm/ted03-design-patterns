package model;

public class EnchantedDoor implements AbstractDoor {

	private String doorName;
	
	public EnchantedDoor() {
		this.doorName = "Enchanted Door";
	}

	@Override
	public String getDoorName() {
		// TODO Auto-generated method stub
		return doorName;
	}
	

}
