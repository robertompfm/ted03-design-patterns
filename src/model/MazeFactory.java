package model;

public class MazeFactory implements AbstractMazeFactory {

	@Override
	public AbstractMaze makeMaze() {
		// TODO Auto-generated method stub
		return new Maze();
	}

	@Override
	public AbstractDoor makeDoor() {
		// TODO Auto-generated method stub
		return new Door();
	}

	@Override
	public AbstractWall makeWall() {
		// TODO Auto-generated method stub
		return new Wall();
	}

	@Override
	public AbstractRoom makeRoom() {
		// TODO Auto-generated method stub
		return new Room();
	}
	
	
}
