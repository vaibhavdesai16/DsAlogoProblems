import java.util.ArrayList;

/**
 * Compass
 */
public class Compass {
    ArrayList<Character> direction;
    Compass(){
      direction = new ArrayList<Character>();
      direction.add(N);
      direction.add(E);
      direction.add(S);
      direction.add(W);
    }

    public Rover rotateCompass(Rover rover, Char direction){
        char postion = rover.getHeadRection();
        int postionValue = direction.indexOf(postion);
        switch (direction) {
            case L:
                postionValue =- 1;
                break;
        
            case R:
                postionValue =+ 1;
                break;
        }
        if(postionValue == -1){
            postionValue = 3;
        }
       
        rover.setHeadRection(direction.get(postionValue));
        return rover;
    }
}