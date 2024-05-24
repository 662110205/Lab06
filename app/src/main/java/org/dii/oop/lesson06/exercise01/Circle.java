//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.src.main.java.org.dii.oop.lesson06.exercise01;

class Circle extends Shape {
    public Circle(double rad) {
        this.rad = rad;
    }

    public double calArea(double rad) {
        this.area = Math.PI * Math.pow(rad, 2.0);
        return this.area;
    }

    public double calPerimeter(double rad) {
        this.perimeter = 6.283185307179586 * rad;
        return this.perimeter;
    }
}