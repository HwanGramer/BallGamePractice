package org.nhnacademy.canonBallGame;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class World extends Frame{
    List<Ball> balls;
    List<Shape> shapes; //? 이걸 그려넣어야됨..

    public World(int width , int height){
        super("BallWorld");
        super.setSize(width , height);
        balls = new LinkedList<>();
        shapes = new LinkedList<>();
    }

    public void add(Ball ball){
        balls.add(ball);
    }

    public void shapeAdd(Shape shape){
        shapes.add(shape);
        //? 여기까지함 //? 여기까지함 //? 여기까지함 //? 여기까지함 
        //? 여기까지함 
    }


    @Override
    public void paint(Graphics graphics){
        for(Ball ball : balls){
            ball.draw(graphics);
        }
        for(Shape shape : shapes){
            shape.draw(graphics);
        }
    }
}
