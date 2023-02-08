package test;

import java.awt.Color;

import org.nhnacademy.canonBallGame.BoundedBall;
import org.nhnacademy.canonBallGame.BoundedShape;
import org.nhnacademy.canonBallGame.Point;
import org.nhnacademy.canonBallGame.Shape;
import org.nhnacademy.canonBallGame.WalledWorld;

public class TestWalledWorld {

    public static void main(String[] args) throws InterruptedException{
        WalledWorld world = new WalledWorld(700,600);

        world.setInterval(50);

        BoundedBall ball = new BoundedBall(new Point(100, 100), 20 , Color.BLUE);

        ball.setVelocity(20);
        ball.setAngle(20);

        BoundedBall ball2 = new BoundedBall(new Point(200, 100), 20 , Color.RED);

        ball2.setVelocity(20);
        ball2.setAngle(20);
        BoundedBall ball3 = new BoundedBall(new Point(300, 300), 20 , Color.BLACK);

        ball3.setVelocity(20);
        ball3.setAngle(20);

        BoundedBall ball4 = new BoundedBall(new Point(350, 350), 20 , Color.ORANGE);

        ball4.setVelocity(50);
        ball4.setAngle(20);

        BoundedShape shape = new BoundedShape(new Point(200,50), 100, 100, Color.DARK_GRAY);

        world.shapeAdd(shape);

        BoundedShape shape2 = new BoundedShape(new Point(0, 300), 100, 100, Color.DARK_GRAY);

        world.shapeAdd(shape2);

        world.add(ball);
        world.add(ball2);
        world.add(ball3);
        world.add(ball4);

        world.setVisible(true);
        world.run(10000);

    }
    
}
