package org.nhnacademy.canonBallGame;

import java.awt.*;

public class Ball {

    private double x;
    private double y;
    private double radius;
    private Color color;

    public Ball(double x , double y , double radius , Color color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public Ball(double x , double y , double radius){
        this(x ,y , radius , Color.BLACK);
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
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

    public void draw(Graphics graphics){
        Color oldColor = graphics.getColor();

        graphics.setColor(this.color);
        graphics.fillOval((int)(this.x - radius), (int)(this.y - radius), (int) (radius*2), (int)(radius*2));
        
        graphics.setColor(oldColor);
    }
    
}
