package io.abstraction;

public abstract class GraphicObject {
    int x, y;

    GraphicObject(){
        System.out.println("base abstract class");
    }
    
    void moveTo(int newX, int newY){
        System.out.println("move to x: " + x + " y: " + y);
    }

    abstract void draw();
    abstract void resize();
    
}
