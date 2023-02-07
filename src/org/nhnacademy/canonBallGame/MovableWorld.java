package org.nhnacademy.canonBallGame;

public class MovableWorld extends World{

    double interval; //? 멈추는시간

    public MovableWorld(int width , int height){
        super(width , height);
        this.interval = 0;
    }

    public double getInterval(){
        return this.interval;
    }

    public void setInterval(double interval){
        this.interval = interval;
    }

    public void next(){ //? 볼의 위치를 바꿈 
        for(Ball ball : balls){
            if(ball instanceof MovableBall){
                ((MovableBall) ball).next();
            }
        }
    }

    public void run(long seconds) throws InterruptedException{
        long startTime = System.currentTimeMillis();
        //? 현재시간부터 내가 준 시간만큼까지 돈다. 볼의 위치를 계속 돌린다.

        while(System.currentTimeMillis() < startTime + seconds * 1000){
            next();
            repaint();
            Thread.sleep((long)this.interval);
        }
    }

}
