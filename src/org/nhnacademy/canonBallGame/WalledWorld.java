package org.nhnacademy.canonBallGame;

import java.awt.*;

public class WalledWorld extends MovableWorld{
    Region leftWall;
    Region rightWall;
    Region topWall;
    Region bottomWall;

    public WalledWorld(int width , int height){
        super(width, height);
        this.leftWall = new Region(-width ,-height,width,3*height);
        this.rightWall = new Region(width ,-height,width,3*height);
        this.topWall = new Region(-width , height , width*3 , height);
        this.bottomWall = new Region(-width , -height , width*3 , height);
    }

    @Override
    public void next(){
        super.next();
        for(Ball ball : balls){
            if(ball instanceof BoundedBall){
                BoundedBall boundedBall = (BoundedBall) ball;
                if(this.leftWall.isCollision(boundedBall.getRegion()) || (this.rightWall.isCollision(boundedBall.getRegion())) ){
                    boundedBall.turnX();
                }

                if(this.topWall.isCollision(boundedBall.getRegion()) || (this.bottomWall.isCollision(boundedBall.getRegion())) ){
                    boundedBall.turnY();
                }

                for(Ball otherBall : balls){
                    if(boundedBall!=otherBall){   //? 나 와 다른공만 해당
                        if(boundedBall.getRegion().isCollision(otherBall.getRegion())){ //? 볼과 다른볼이 겹친다면
                            boundedBall.turnX();
                        }
                    }

                    //? 숙제 월드에 박스를 추가 Box타입 box Class
                }


            }
        }
    }
}
