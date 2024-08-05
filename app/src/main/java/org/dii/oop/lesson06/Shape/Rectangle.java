//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.src.main.java.org.dii.oop.lesson06.Shape;

public class Rectangle extends Shape {
    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public double calArea(double width, double high) {
        this.area = width * high;
        return this.area;
    }

    public double calPerimeter(double width, double high) {
        this.perimeter = width * 2.0 + high * 2.0;
        return this.perimeter;
    }
}
