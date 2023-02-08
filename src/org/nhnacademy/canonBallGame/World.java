package org.nhnacademy.canonBallGame;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class World extends Frame{
    List<Shapes> shapes;
    // List<Shape> shapes; //? 이걸 그려넣어야됨..

    public World(int width , int height){
        super("BallWorld");
        super.setSize(width , height);
        shapes = new LinkedList<>();
        // shapes = new LinkedList<>();
    }

    public void add(Ball ball){
        shapes.add(ball);
    }

    // public void shapeAdd(Shape shape){
    //     shapes.add(shape);
    // }


    @Override
    public void paint(Graphics graphics){
        for(Shapes ball : shapes){
            ball.draw(graphics);
        }
        // for(Shape shape : shapes){
        //     shape.draw(graphics);
        // }


    }
}
