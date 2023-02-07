package org.nhnacademy.canonBallGame;

import java.awt.*;

public class BoundedShape extends Shape{
    
    Region bounds;
    //? BoundedShape는 부딫히면 튕기는 클래스 

    public BoundedShape(Point location , int width , int height , Color color){
        super(location, width, height, color);
    }
}
