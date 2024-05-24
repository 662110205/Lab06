//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.src.main.java.org.dii.oop.lesson06.exercise01;

class Shape {
    private String name = "";
    private int numSide = 0;
    protected double area = 0.0;
    protected double perimeter = 0.0;
    protected double rad = 0.0;
    protected double width = 0.0;
    protected double high = 0.0;
    protected double side = 0.0;

    Shape() {
    }

    public String getArea() {
        return String.valueOf(Math.floor(this.area * 100.0) / 100.0);
    }

    public String getPerimeter() {
        return String.valueOf(Math.floor(this.perimeter * 100.0) / 100.0);
    }
    public String getNumside(){
        return String.valueOf(numSide);
    }
    public double setNumside(int num){
        this.numSide = num;
        return numSide;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }
    public String getName(){
        return name;
    }
}
