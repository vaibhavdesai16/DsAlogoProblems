package com.techgig;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		byte input1 = scanner.nextByte();
		boolean iswin = true;

		for(int i=0; i<input1; i++ ){
			
			short input2 = scanner.nextShort();
			int[] v_energyLevels = new int[input2]; 
			int[] p_energyLevels = new int[input2];

			for(int j=0; j<input2; j++){
				v_energyLevels[j] = scanner.nextInt();
			}

			for(int j=0; j<input2; j++){
				p_energyLevels[j] = scanner.nextInt();
			}

			iswin = energyLevelComparison(p_energyLevels, v_energyLevels, input2);
			if(iswin){
			System.out.println("WIN");
			}
			else{
			System.out.println("LOSE");
			}
		}

		
	}

	public static boolean energyLevelComparison(int[] player, int[] villan, int energy_levels) {
		int row_sum = 0;
		int expected_sum = 0;
		boolean win = true;
		for (int i = 0; i < energy_levels; i++) {
			for (int j = 0; j < energy_levels; j++) {
				if (player[i] > villan[j]) {
					row_sum++;
				}
			}

			expected_sum += i + 1;
			if (expected_sum > row_sum) {
				win = false;
			}

		}
		return win;
	}
}
