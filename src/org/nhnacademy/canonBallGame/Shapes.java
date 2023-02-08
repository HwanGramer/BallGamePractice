package org.nhnacademy.canonBallGame;

import java.awt.Graphics;

abstract class Shapes {
    Point location;

    public Shapes(Point location){
        this.location = location;
    }

    public double getX(){
        return this.location.getX();
    }

    public double getY(){
        return this.location.getY();
    }

    abstract Region getRegion();

    abstract void draw(Graphics graphics);
}
