package org.nhnacademy.canonBallGame;

public class Motion {

    double velocity; 
    double angle;    
    double dx;
    double dy;

    public Motion(){
        this.velocity = 0;
        this.angle = 0;
        this.dx = 0;
        this.dy = 0;
    }
    
    public double getVelocity(){
        return this.velocity;
    }
    public double getAngle(){
        return this.angle;
    }
    public double getDX(){
        return this.dx;
    }
    public double getDY(){
        return this.dy;
    }

    public void setVelocity(double velocity){
        this.velocity = velocity;
        updateDXDY();
    }
    public void setAngle(double angle){
        this.angle = angle;
        updateDXDY();
    }
    public void setDX(double dx){
        this.dx = dx;
        updateVelocityAndAngle();
    }
    public void setDY(double dy){
        this.dy = dy;
        updateVelocityAndAngle();
    }

    public void setDXDY(double dx , double dy){
        this.dx = dx;
        this.dy = dy;
        updateVelocityAndAngle();
    }

    public void add(Motion motion){ //? 모션과모션의 dxdy를 더함.
        this.dx += motion.getDX();
        this.dy += motion.getDY();
        updateVelocityAndAngle();
    }

    private void updateDXDY(){ //? 속도와 각도에서 DXDY를 뽑아낸다.
        double radian = Math.toRadians(angle);
        dx = velocity * Math.cos(radian);
        dy = velocity * Math.sin(radian);
    }

    private void updateVelocityAndAngle(){ //? 각도와 속도를 뽑아낸다.
        velocity = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        angle = Math.toDegrees(Math.asin(dy / this.velocity));
    }
}
