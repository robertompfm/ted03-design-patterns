package view;

import java.util.Scanner;

import model.AbstractDoor;
import model.AbstractMaze;
import model.AbstractMazeFactory;
import model.AbstractRoom;
import model.AbstractWall;
import model.EnchantedMazeFactory;
import model.MazeFactory;

public class MazeGame {

	
	public static void createMaze(String mazeType) {
		AbstractMazeFactory factory;
		if (mazeType.equals("enchanted")) {
			factory = new EnchantedMazeFactory();
		} else {
			factory = new MazeFactory();
		}
		AbstractDoor door = factory.makeDoor();
		System.out.println("Created " + door.getDoorName());
		AbstractRoom room = factory.makeRoom();
		System.out.println("Created " + room.getRoomName());
		AbstractWall wall = factory.makeWall();
		System.out.println("Created " + wall.getWallName());
		AbstractMaze maze = factory.makeMaze();
		System.out.println("Created " + maze.getMazeName());		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Do you want an enchanted maze? [y/n]: ");
		String ans = scanner.next();
		String mazeType = (ans.toUpperCase().equals("Y")) ? "enchanted" : "normal";
		createMaze(mazeType);
		
	}
}
