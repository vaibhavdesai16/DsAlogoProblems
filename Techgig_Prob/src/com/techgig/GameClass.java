package com.techgig;

public class GameClass {

	public void energyLevelComparison(int[] player, int[] villan) {
		int len_player = player.length;
		int len_villan = villan.length;
		int row_sum = 0;
		int expected_sum = 0;
		boolean win = true;
		for (int i = 0; i < len_player; i++) {
			for (int j = 0; j < len_villan; j++) {
				if (player[i] > villan[j]) {
					row_sum++;
				}
			}

			expected_sum += i + 1;
			if (expected_sum > row_sum) {
				win = false;
			}

		}
		
		System.out.println(win);
	}

}
