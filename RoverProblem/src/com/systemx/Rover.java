package com.systemx;

public class Rover {

    private int positionX;
    private int positionY;
    private char headRection;
    private boolean isRovercrashed = false;
    Plateau plateau = Plateau.getInstance();


    public int getPositionX() {
        return positionX;
    }


    public void setPositionX(int positionX) {
    	if(positionX > plateau.getMaxX() || positionX < plateau.getMinX())
    		this.isRovercrashed = true;
    	else
        this.positionX = positionX;
    }


    public int getPositionY() {
        return positionY;
    }


    public void setPositionY(int positionY) {
    	if(positionY > plateau.getMaxY() || positionY < plateau.getMinY())
    		this.isRovercrashed = true;
    	else
        this.positionY = positionY;
    }


    public char getHeadRection() {
        return headRection;
    }


    public void setHeadRection(char headRection) {
        this.headRection = headRection;
    }


	public boolean isRovercrashed() {
		return isRovercrashed;
	}

    
}