package org.nhnacademy.canonBallGame;

public class Point {

    double x;
    double y;

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
    
    public void move(double dx , double dy){ //? 이동
        this.x += dx;
        this.y += dy;
    }
}
