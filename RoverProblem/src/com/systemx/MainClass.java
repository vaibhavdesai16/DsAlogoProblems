package com.systemx;

public class MainClass {
	
	public static void main (String args[]) {
		
		
	}
	
	public String runTheRover(String upper_right, String start_state, String movement) {
		Rover rover = new Rover();
		ActionResolver actionResolver = new ActionResolver();
	
		//input extraction for uppter_right goes here
		String[] upperRight = upper_right.split("\\s");
		int boundaryX = Integer.parseInt(upperRight[0]);
		int boundaryY = Integer.parseInt(upperRight[1]);
		
		//fixing the boundaries 
		Plateau plateau = Plateau.getInstance();
		plateau.setMaxX(boundaryX);
		plateau.setMaxY(boundaryY);
				
		//input extracting for start_state goes here
		String[] startStateArray = start_state.split("\\s");
		int positionX =  Integer.parseInt( startStateArray[0]);
		int positionY = Integer.parseInt( startStateArray[1]);
		char initailHeadDirectio =  startStateArray[2].toCharArray()[0];
			
		//setting rover's initial state
		rover = actionResolver.setInitialState(rover, positionX, positionY, initailHeadDirectio);
		
		//simulating all moves 
		for(int i = 0; i < movement.length(); i++) {
			// if turning left or right 
			if(movement.charAt(i) == 'L' || movement.charAt(i) == 'R') {
				rover = actionResolver.changeDirection(rover, movement.charAt(i));
			}
			// if moving ahead one unit
			else {
				rover = actionResolver.compuetNextCordinate(rover);
			}
		}
		
		
		if(!rover.isRovercrashed())			
		return rover.getPositionX() + " "+ rover.getPositionY() + " " + rover.getHeadRection(); 
		else
		return "Rover is crashed outside of Plateau";	
		
	}

}
