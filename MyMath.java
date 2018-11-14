package com.company;

public class MyMath {

    public static int manhattanDistance(Point p1,Point p2){
        return (
                Math.abs((p1.x-p2.x))
                +Math.abs((p1.y-p2.y))
                +Math.abs((p1.z-p2.z))
        );
    }
}
