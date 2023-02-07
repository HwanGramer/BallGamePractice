package test;

import java.awt.Color;
import java.util.Random;

import org.nhnacademy.canonBallGame.BoundedBall;
import org.nhnacademy.canonBallGame.BoundedWorld;
import org.nhnacademy.canonBallGame.Point;

public class TestBoundedWorld {

    public static void main(String[] args) throws InterruptedException{
        BoundedWorld world = new BoundedWorld(500, 400);
        world.setInterval(100);

        BoundedBall ball = new BoundedBall(new Point(100, 100), 50 , Color.BLUE);

        ball.setVelocity(20);
        ball.setAngle(20);

        BoundedBall ball2 = new BoundedBall(new Point(200, 200), 50 , Color.RED);

        ball2.setVelocity(20);
        ball2.setAngle(20);

        // Random random = new Random();

        // for(int i=0; i < 10 ; i++){
        //     BoundedBall balll = new BoundedBall(new Point(200, 200),50, new Color(random.nextInt()*99999999));
        //     balll.setAngle(20);
        //     balll.setVelocity(20);
        //     world.add(balll);
        // }

        world.add(ball);
        world.add(ball2);
        world.setVisible(true);
        world.run(100);
    }
    
}
