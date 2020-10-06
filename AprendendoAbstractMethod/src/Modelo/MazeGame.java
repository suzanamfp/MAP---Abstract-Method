package Modelo;

import Factorys.AbstractMazeFactory;

public class MazeGame { //Jogo de Labrinto (OBJETIVO)
	
	public void createMaze(AbstractMazeFactory amf) {
		amf.fazerWall();
		amf.fazerRoom();
		amf.fazerDoor();
	}
	



	
	
}
