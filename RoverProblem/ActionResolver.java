import java.util.HashMap;
import java.util.Hashtable;

/**
 * ActionResolver
 */
public class ActionResolver {

    Compass compass;

    ActionResolver(){
        compass = new Compass();
    }

   public Rover compuetNextCordinate(Rover rover)
   {
        Char direction = roverState.getHeadRection();  
        switch(direction){
            case E:
             rover.setPositionX(rover.getPositionX() + 1);
            break;

            case W:
            rover.setPositionX(rover.getPositionX() - 1);
            break;

            case S:
            rover.setPositionY(rover.getPositionY() - 1);
            break;

            case N:
            rover.setPositionY(rover.getPositionY() + 1);
            break;
        }   
        
        return rover;
    }

   public Rover changeDirection(Rover rover, Char direction){
      compass.rotateCompass(rover, direction);
   }

}