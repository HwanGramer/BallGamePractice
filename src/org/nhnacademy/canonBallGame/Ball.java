package org.nhnacademy.canonBallGame;

import java.awt.*;

public class Ball extends Shapes{
    double radius;
    Color color;

    public Ball(Point location, double radius , Color color){
        super(location);
        this.radius = radius;
        this.color = color;
    }

    public Ball(Point location , double radius){
        this(location, radius , Color.BLACK);
    }

    public double getX(){
        return this.location.getX();
    }

    public double getY(){
        return this.location.getY();
    }

    public double getRadius(){
        return this.radius;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public Region getRegion(){
        return new Region((int)(getX() - getRadius()) , (int) (getY() - getRadius()) , (int)(2*getRadius()) , (int)(2*getRadius())  ) ;
    }

    @Override
    public void draw(Graphics graphics){
        Color oldColor = graphics.getColor();

        graphics.setColor(this.color);
        graphics.fillOval((int)(this.location.getX() - radius), (int)(this.location.getY() - radius), (int) (radius*2), (int)(radius*2));

        graphics.setColor(oldColor);
    }
    
}
