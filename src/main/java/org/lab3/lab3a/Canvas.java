package org.lab3.lab3a;


public class Canvas {
    Shape shape;

    public Canvas(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }
}
