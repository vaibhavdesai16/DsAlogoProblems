package com.systemx;

import java.util.ArrayList;

public class Compass {
    ArrayList<Character> direction;
    Compass(){
      direction = new ArrayList<Character>();
      direction.add('N');
      direction.add('E');
      direction.add('S');
      direction.add('W');
    }

    public Rover rotateCompass(Rover rover, char directionChar){
        char postion = rover.getHeadRection();
        int postionValue = direction.indexOf(postion);
        switch (directionChar) {
            case 'L':
                postionValue = postionValue - 1;
                break;
        
            case 'R':
                postionValue =  postionValue + 1;
                break;
        }
        if(postionValue == -1){
            postionValue = 3;
        }
        postionValue = postionValue%4;
        rover.setHeadRection(direction.get(postionValue));
        return rover;
    }
}