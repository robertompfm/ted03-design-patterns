package model;

public class Door implements AbstractDoor {

	private String doorName;
	
	public Door() {
		this.doorName = "Door";
	}

	@Override
	public String getDoorName() {
		// TODO Auto-generated method stub
		return doorName;
	}
	
	

}
