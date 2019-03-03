package com.systemx.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.systemx.MainClass;

public class CompleteRoverTester {
	
	MainClass main = new MainClass();
	
	@Test
	public void roverTest1() {
		String roverEndPostionTest = main.runTheRover("5 5","1 2 N" ,"LMLMLMLMM" );
		assertEquals("1 3 N", roverEndPostionTest);
		
	}
	
	@Test
	public void roverTest2() {
		
		String roverEndPostionTest = main.runTheRover("5 5","3 3 E" ,"MMRMMRMRRM" );
		assertEquals("5 1 E", roverEndPostionTest);
	}
	
	@Test
	public void roverTest3() {
		
		String roverEndPostionTest = main.runTheRover("5 5","0 0 S" ,"MM" );
		assertEquals("1 3 N", roverEndPostionTest);
	}
	
	
	

}
