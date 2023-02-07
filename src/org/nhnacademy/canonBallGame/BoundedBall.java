package org.nhnacademy.canonBallGame;

import java.awt.*;

public class BoundedBall extends MovableBall{

    Region bounds;

    public BoundedBall(Point location , double radius , Color color){
        super(location , radius , color);
        bounds = new Region(0,0,0,0);
    }

    public BoundedBall(Point location , double radius){
        super(location , radius , Color.BLACK);
    }

    public void setBounds(Region bounds){
        this.bounds = bounds;
    }

    public void turnX(){ //? DX를 -로 뒤집어준다.
        motion.setDX(-motion.getDX());
    }

    public void turnY(){ //? 벽에 부딫히면 DX는 -로 바뀌면서 move되면 계속 x - dx 된다.
        motion.setDY(-motion.getDY());
    }

    public Region getRegion(){
        return new Region((int)(getX() - getRadius()) , (int) (getY() - getRadius()) , (int)(2*getRadius()) , (int)(2*getRadius())  ) ;
    }

    @Override
    public void next(){
        super.next();
        if(this.bounds.isCollision(getRegion())){
            if((getX() < bounds.getX()) || (bounds.getX() + bounds.getWidth() < getX())){
                turnX();
            }
            if((getY() < bounds.getY()) || (bounds.getY() + bounds.getHeight() < getY())){
                turnY();
            }
        }
    }
    
}
