package com.techgig;

public class SuperHerosGame {
	
	public boolean energyLevelComparison(int[] player, int[] villan, int energy_levels) {
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
			if (expected_sum >= row_sum) {
				win = false;
			}

		}
		return win;
	}

}
