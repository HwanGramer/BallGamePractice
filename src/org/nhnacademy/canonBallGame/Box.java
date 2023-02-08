package org.nhnacademy.canonBallGame;

import java.awt.*;

public class Box extends Shapes{
    Point location;
    double width;
    double height;
    Color color;

    public Box(Point location , double width , double heigth , Color color){
        super(location);
        this.width = width;
        this.height = heigth;
        this.color = color;
    }
    public Box(Point location , double width , double heigth){
        this(location, width, heigth, Color.BLACK);
    }

    
    public double getX(){
        return this.location.getX();
    }

    public double getY(){
        return this.location.getY();
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public Region getRegion(){
        return new Region((int)(getX() - getHeight()) , (int) (getY() - getWidth()/2) , (int)(2*getWidth()) , (int)(2*getHeight())) ;
    }

    @Override
    public void draw(Graphics graphics){
        Color oldColor = graphics.getColor();

        graphics.setColor(this.color);
        graphics.fillRect((int)(getX() - getHeight()) , (int) (getY() - getWidth()/2) , (int)(2*getWidth()) , (int)(2*getHeight()));

        graphics.setColor(oldColor);
    }



}
