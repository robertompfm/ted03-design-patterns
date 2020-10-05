package model;

public interface AbstractMazeFactory {

	AbstractMaze makeMaze();
	AbstractDoor makeDoor();
	AbstractWall makeWall();
	AbstractRoom makeRoom();
}
