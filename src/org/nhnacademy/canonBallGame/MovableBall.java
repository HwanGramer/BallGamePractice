package org.nhnacademy.canonBallGame;

import java.awt.*;

public class MovableBall extends Ball{
    // double velocity; //? 속도
    // double angle;    //? 각도

    Motion motion;

    public MovableBall(Point location , double radius , Color color){
        super(location, radius , color);
        this.motion = new Motion();
    }

    public MovableBall(Point location , double radius){
        super(location, radius , Color.BLACK);
    }

    public double getVelocity(){
        return this.motion.velocity;
    }

    public double getAngle(){
        return this.motion.getAngle();
    }

    public void setVelocity(double velocity){
        this.motion.setVelocity(velocity);
    }

    public void setAngle(double angle){
        this.motion.setAngle(angle);
    }

    public void next(){
        location.move(this.motion.getDX(), this.motion.getDY());
    }
}
