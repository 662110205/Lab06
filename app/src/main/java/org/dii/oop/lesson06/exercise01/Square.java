//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.src.main.java.org.dii.oop.lesson06.exercise01;

class Square extends Shape {
    public Square(double side) {
        this.side = side;
    }

    public double calArea(double side) {
        this.area = side * side;
        return this.area;
    }

    public double calPerimeter(double side) {
        this.perimeter = side * 4.0;
        return this.perimeter;
    }
}