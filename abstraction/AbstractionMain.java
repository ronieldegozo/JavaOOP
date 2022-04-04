package io.abstraction;

public class AbstractionMain {
    
    public static void main (String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();

        GraphicObject graphob = new GraphicObject();
        
    }

}
