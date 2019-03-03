package com.systemx.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.systemx.ActionResolver;
import com.systemx.Rover;

public class ActionResolverTest {
	
	ActionResolver actionResolver = new ActionResolver();
	
	@Test
	public void computeCordinateTest1() {
		Rover rover = new Rover(); 
		rover.setHeadRection('N');
		rover.setPositionX(1);
		rover.setPositionY(1);		
		Rover movedRover = actionResolver.compuetNextCordinate(rover);
		rover.setPositionY(2);
		assertEquals(rover, movedRover);	
	}
	
	@Test
	public void changeDirectionTest() {
		Rover rover = new Rover(); 
		rover.setHeadRection('E');
		rover.setPositionX(1);
		rover.setPositionY(1);	
		Rover movedRover = actionResolver.changeDirection(rover, 'L');
		rover.setHeadRection('N');
		assertEquals(rover, movedRover);	
	}

}
