package org.nhnacademy.canonBallGame;

public class BoundedWorld extends MovableWorld{

    public BoundedWorld(int width , int height){
        super(width, height);
    }

    public Region getRegion(){
        return new Region(0, 0, getWidth(), getHeight());
    }

    public void add(BoundedBall ball){
        ball.setBounds(new Region((int) (ball.getRadius()),(int) (ball.getRadius()), (int)(getWidth() - 2 * ball.getRadius())
        , (int)(getHeight() - 2 * ball.getRadius())));
        super.add(ball);
    }
    
}
