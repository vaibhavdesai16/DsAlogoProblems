package com.consecutive_integer;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveTest {
	
	
   FindConsecutive consecutiveInt = new FindConsecutive();
	
	
	@Test
	public void getConsecutiveIntWindowTest() {
		int[] arr = {10,11,12,13,14,15,16,17,18,19,20};
		int[] window =  consecutiveInt.getConsecutiveIntWindow(arr, arr.length, 10, 1);
		int[] expectedWinodw = {20};
		Assert.assertArrayEquals(expectedWinodw, window);
	}
	
	@Test
	public void sortAndFindTest() {
		int[] arr = {10,11,12,13};
		Assert.assertTrue(consecutiveInt.sortAndFind(arr));
	}
	
	@Test
	public void sortAndFindTest2() {
		int[] arr = {10,12,15, 13};
		Assert.assertFalse(consecutiveInt.sortAndFind(arr));
	}
	
	@Test
	public void getMaxConsecutiveTest() {
		int[] arr = {99,4,9,12,11,10,13,20,22,21,26,25,24,23,27,50,52,55 };
		int consv = consecutiveInt.getMaxConsecutive(arr, arr.length);
		System.out.println(consv);
		Assert.assertEquals(8, consv);;
	}
	
	@Test
	public void getMaxConsecutiveTest2() {
		int[] arr = {9, 6, 44, 51,56,55,54,53,52,65, 41};
		int consv = consecutiveInt.getMaxConsecutive(arr, arr.length);
		System.out.println(consv);
		Assert.assertEquals(6, consv);;
	}
	
	@Test
	public void getMaxConsecutiveTest3() {
		int[] arr = {11,12,13};
		int consv = consecutiveInt.getMaxConsecutive(arr, arr.length);
		System.out.println(consv);
		Assert.assertEquals(3, consv);;
	}

}
