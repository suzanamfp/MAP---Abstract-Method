package Modelo;

import Factorys.AbstractMazeFactory;

public class Maze { //Labirinto

	private AbstractRoom room;
	private AbstractWall wall;
	private AbstractDoor door;
	
	public Maze() {}
	
	

	

	public AbstractRoom getRoom() {
		return room;
	}





	public void setRoom(AbstractRoom room) {
		this.room = room;
	}





	public AbstractWall getWall() {
		return wall;
	}





	public void setWall(AbstractWall wall) {
		this.wall = wall;
	}





	public AbstractDoor getDoor() {
		return door;
	}





	public void setDoor(AbstractDoor door) {
		this.door = door;
	}





	@Override
	public String toString() {
		return "Maze [room=" + room + ", wall=" + wall + ", door=" + door + "]";
	}


	
	
}
