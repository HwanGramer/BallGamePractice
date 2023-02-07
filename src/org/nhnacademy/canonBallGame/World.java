package org.nhnacademy.canonBallGame;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class World extends Frame{
    List<Ball> balls;

    public World(int width , int height){
        super("BallWorld");
        super.setSize(width , height);
        balls = new LinkedList<>();
    }

    public void add(Ball ball){
        balls.add(ball);
    }

    @Override
    public void paint(Graphics graphics){
        for(Ball ball : balls){
            ball.draw(graphics);
        }
    }
}
