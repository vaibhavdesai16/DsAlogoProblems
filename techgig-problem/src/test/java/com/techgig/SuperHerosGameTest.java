package com.techgig;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SuperHerosGameTest {
	
	@Test
	public void energyLevelComparisonTest0() {
		SuperHerosGame superHerosGame = new SuperHerosGame();
		int[] pEnergy = {30, 40, 50, 60};
		int[] vEnergy = {59, 49, 39, 29};
		assertTrue( superHerosGame.energyLevelComparison(pEnergy, vEnergy, pEnergy.length) );		
	}
	
	@Test
	public void energyLevelComparisonTest1() {
		SuperHerosGame superHerosGame = new SuperHerosGame();
		int[] pEnergy = {100, 100, 100, 98};
		int[] vEnergy = {98, 98, 98, 98};
		assertFalse( superHerosGame.energyLevelComparison(pEnergy, vEnergy, pEnergy.length) );		
	}
	
	@Test
	public void energyLevelComparisonTest2() {
		SuperHerosGame superHerosGame = new SuperHerosGame();
		int[] pEnergy = {100, 100, 100, 99};
		int[] vEnergy = {98, 98, 98, 99};
		assertTrue( superHerosGame.energyLevelComparison(pEnergy, vEnergy, pEnergy.length) );		
	}
	
	@Test
	public void energyLevelComparisonTest3() {
		SuperHerosGame superHerosGame = new SuperHerosGame();
		int[] pEnergy = {100, 100, 100, 100, 100, 100};
		int[] vEnergy = {99, 99, 100, 99, 99, 99};
		assertFalse( superHerosGame.energyLevelComparison(pEnergy, vEnergy, pEnergy.length) );		
	}

}
