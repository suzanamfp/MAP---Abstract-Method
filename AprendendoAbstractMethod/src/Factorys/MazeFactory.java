package Factorys;

import Modelo.AbstractDoor;
import Modelo.AbstractRoom;
import Modelo.AbstractWall;
import Modelo.Door;
import Modelo.DoorSimples;
import Modelo.Maze;
import Modelo.Room;
import Modelo.RoomSimples;
import Modelo.Wall;
import Modelo.WallSimples;

public class MazeFactory  extends AbstractMazeFactory{

	@Override
	public AbstractWall fazerWall() {
		return new WallSimples();
	}

	@Override
	public AbstractRoom fazerRoom() {
		return new RoomSimples();
	}

	@Override
	public AbstractDoor fazerDoor() {
		return new DoorSimples();
	}

	
}
