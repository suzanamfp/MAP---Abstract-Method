package Factorys;

import Modelo.AbstractDoor;
import Modelo.AbstractRoom;
import Modelo.AbstractWall;
import Modelo.Door;
import Modelo.EnchantedDoor;
import Modelo.EnchantedRoom;
import Modelo.EnchantedWall;
import Modelo.Maze;
import Modelo.Wall;

public class EnchantedMazeFactory extends AbstractMazeFactory{

	@Override
	public AbstractWall fazerWall() {
		return new EnchantedWall();
	}

	@Override
	public AbstractRoom fazerRoom() {
		return new EnchantedRoom();
	}

	@Override
	public AbstractDoor fazerDoor() {
		return new EnchantedDoor();
	}

	
	

}
