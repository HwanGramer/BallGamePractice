package test;

import org.nhnacademy.canonBallGame.Ball;
import org.nhnacademy.canonBallGame.Point;
import org.nhnacademy.canonBallGame.World;

public class TestWorld {

    public static void main(String[] args){
        World world = new World(500, 500);

        world.add(new Ball(new Point(200, 200), 50));
        // world.add(new Ball(200, 200, 100));

        world.setVisible(true);
    }
    
}
