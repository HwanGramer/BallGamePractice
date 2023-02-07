package test;

import org.nhnacademy.canonBallGame.MovableBall;
import org.nhnacademy.canonBallGame.MovableWorld;
import org.nhnacademy.canonBallGame.Point;
import java.awt.Color;

public class TestMovableWorld {

    public static void main(String[] args) throws InterruptedException{

        MovableWorld world = new MovableWorld(500,400);

        // world.setInterval(100); //? 월드의 시간을 정함

        MovableBall ball = new MovableBall(new Point(100, 100),50,Color.RED);
        ball.setVelocity(10);
        ball.setAngle(30);
        world.add(ball);

        MovableBall ball2 = new MovableBall(new Point(300, 300),100,Color.blue);
        ball2.setVelocity(20);
        ball2.setAngle(60);
        world.add(ball2);

        // world.add(new MovableBall(new Point(100, 100),50,Color.RED));
        // world.add(new MovableBall(new Point(300, 300),100,Color.BLUE));

        world.setVisible(true);
        world.run(10);

    }
    
    
}
