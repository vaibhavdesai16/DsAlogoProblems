package com.techgig;

public class SuperHerosGame {
	
	public boolean energyLevelComparison(int[] player, int[] villan, int energy_levels) {
		boolean iswin = true;
		
		for(int i=0; i<energy_levels; i++) {
			for(int j=0; j<energy_levels-1; j++) {
				
				if(player[j+1] < player[j]) {
					int temp = player[j+1];
					player[j+1] = player[j];
					player[j] = temp;
				}
				
				if(villan[j+1] < villan[j]) {
					int temp = villan[j+1];
					villan[j+1] = villan[j];
					villan[j] = temp;
				}
			}
		}
		
		for(int i=0; i<energy_levels; i++) {
			if( !(player[i] > villan[i])) {
				iswin = false;
			}
		}
		return iswin;
	}

}
