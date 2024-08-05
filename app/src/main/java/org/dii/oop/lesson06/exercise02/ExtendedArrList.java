package app.src.main.java.org.dii.oop.lesson06.exercise02;

import app.src.main.java.org.dii.oop.lesson06.Shape.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ExtendedArrList<E> extends ArrayList<Shape> {
    public ExtendedArrList() {
    }

    public void listAllShapes() {
        System.out.println("List all shape: \n");

        for(int i = 0; i < this.size(); ++i) {
            Shape temp = (Shape)this.get(i);
            PrintStream var10000 = System.out;
            String var10001 = temp.getName();
            var10000.println("Name: " + var10001 + ", Number of side: " + temp.getNumside() + ", Area: " + temp.getArea() + ", Perimeter: " + temp.getPerimeter());
        }

    }

    public void sumArea() {
        double area = 0.0;

        for(int i = 0; i < this.size(); ++i) {
            Shape temp = (Shape)this.get(i);
            area += temp.getArea();
        }

        System.out.println("summation of area is " + area);
    }
}

