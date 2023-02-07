package org.nhnacademy.canonBallGame;

import java.awt.*;

public class Shape {
    Point location;
    int width;
    int height;
    Color color;

    public Shape(Point location , int width , int height , Color color){
        this.location = location;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public Point getLocation(){
        return this.location;
    }

    public void setwidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setLocation(Point location){
        this.location = location;
    }

    public void draw(Graphics graphics){
        graphics.setColor(this.color);
        graphics.fillRect((int)(location.getX()), (int)location.getY(), this.width, this.height);
    }

}
