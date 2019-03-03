package com.systemx;

public class ActionResolver {

    Compass compass;

    public ActionResolver(){
        compass = new Compass();
    }

   public Rover compuetNextCordinate(Rover rover)
   {
        char direction = rover.getHeadRection();  
        switch(direction){
            case 'E':
             rover.setPositionX(rover.getPositionX() + 1);
            break;

            case 'W':
            rover.setPositionX(rover.getPositionX() - 1);
            break;

            case 'S':
            rover.setPositionY(rover.getPositionY() - 1);
            break;

            case 'N':
            rover.setPositionY(rover.getPositionY() + 1);
            break;
        }   
        
        return rover;
    }

   public Rover changeDirection(Rover rover, char direction){
      return compass.rotateCompass(rover, direction);
   }
   
   public Rover setInitialState(Rover rover,int positionX, int positionY, char haedDirection) {
	   rover.setPositionX(positionX);
	   rover.setPositionY(positionY);
	   rover.setHeadRection(haedDirection);   
	   return rover;
   }

}