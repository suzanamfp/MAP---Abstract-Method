package Factorys;

import Modelo.AbstractDoor;
import Modelo.AbstractRoom;
import Modelo.AbstractWall;
import Modelo.Door;
import Modelo.Maze;
import Modelo.Room;
import Modelo.Wall;

public abstract class AbstractMazeFactory { //Fabrica de Labirinto
	
	
	public abstract AbstractWall fazerWall(); //parede
	public abstract AbstractRoom fazerRoom(); //sala
	public abstract AbstractDoor fazerDoor(); //porta
}
