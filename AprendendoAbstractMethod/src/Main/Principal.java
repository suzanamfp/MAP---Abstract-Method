package Main;

import Factorys.AbstractMazeFactory;
import Factorys.EnchantedMazeFactory;
import Factorys.MazeFactory;
import Modelo.EnchantedRoom;
import Modelo.Maze;
import Modelo.MazeGame;

public class Principal {
	
	
	public static Maze createMaze(String tipo) {
		
		AbstractMazeFactory amf = null;
		
		if (tipo.equals("Encantado")) {
			amf = new EnchantedMazeFactory();
		}else if (tipo.equals("Normal")) {
			amf = new MazeFactory();
		}
		
		Maze m = new Maze();
		m.setRoom(amf.fazerRoom());
		m.setDoor(amf.fazerDoor());
		m.setWall(amf.fazerWall());
		return m;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("************Labirinto Encantado***********");
		Maze m1 = createMaze("Encantado");
		
		System.out.println("***********Labirinto Simples************");
		Maze m2 = createMaze("Normal");
		
		
		
		
		
		//Outra forma de mostrar os labirintos
		
//		System.out.println("************Labirinto Encantado***********");
//		MazeGame mg = new MazeGame();
//		mg.createMaze(new EnchantedMazeFactory());
//		
//		System.out.println("***********Labirinto Simples************");
//		
//		mg.createMaze(new MazeFactory());
		
		
		
		
		
	}
}
