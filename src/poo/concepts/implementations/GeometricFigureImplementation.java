package poo.concepts.implementations;

import poo.concepts.models.Circle;
import poo.concepts.models.GeometricFigure;
import poo.concepts.models.Rectangle;

public class GeometricFigureImplementation {
    public static void main(String[] args) {
        //GeometricFigure geometricFigure = new GeometricFigure(); // Compilation error: GeometricFigure is abstract; cannot be instantiated

        GeometricFigure geometricFigure = new Rectangle(); // GeometricFigure reference to a Rectangle object
        geometricFigure.draw(); // Drawing a rectangle

        // Rectangle class that extends GeometricFigure class and implements the draw method
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        GeometricFigure geometricFigure1 = new Circle(); // GeometricFigure reference to a Circle object
        geometricFigure1.draw(); // Drawing a circle
    }
}
