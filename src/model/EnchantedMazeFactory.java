package model;

public class EnchantedMazeFactory implements AbstractMazeFactory {

	@Override
	public AbstractMaze makeMaze() {
		// TODO Auto-generated method stub
		return new EnchantedMaze();
	}

	@Override
	public AbstractDoor makeDoor() {
		// TODO Auto-generated method stub
		return new EnchantedDoor();
	}

	@Override
	public AbstractWall makeWall() {
		// TODO Auto-generated method stub
		return new EnchantedWall();
	}

	@Override
	public AbstractRoom makeRoom() {
		// TODO Auto-generated method stub
		return new EnchantedRoom();
	}
	
	
}
