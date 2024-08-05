package app.src.main.java.org.dii.oop.lesson06.exercise02;

import java.util.Iterator;
import java.util.Scanner;
import app.src.main.java.org.dii.oop.lesson06.Shape.*;
import java.util.ArrayList; //this exercise MUST use extended version of arrayList

public class Lesson {
    public static void run() {

        ArrayList<String> StoreShape = new ArrayList();
        Scanner in = new Scanner(System.in);

        String choice;

        do {
            System.out.print("1. Circle\n2. Rectangle\n3. Square\n4. Display all shape\n5. Show summation of area\n6. exit\nPlease select [1-6]:");
            choice = in.nextLine().trim();
            String strSide;
            double side;
            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                Circle circle = new Circle(side);
                circle.calArea(side);
                circle.calPerimeter(side);
                circle.setName("Circle");
                StoreShape.add(circle.getName());
                circle.setNumside(0);
                StoreShape.add(circle.getNumside());
                StoreShape.add(String.valueOf(circle.getArea()));
                StoreShape.add(circle.getPerimeter());
            }

            String name;
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                strSide = in.nextLine();
                System.out.print("Enter height: ");
                name = in.nextLine();
                double width = Double.parseDouble(strSide);
                double height = Double.parseDouble(name);
                Rectangle rectangle = new Rectangle(width, height);
                rectangle.calArea(width, height);
                rectangle.calPerimeter(width, height);
                rectangle.setName("Rectangle");
                StoreShape.add(rectangle.getName());
                rectangle.setNumside(4);
                StoreShape.add(rectangle.getNumside());
                StoreShape.add(String.valueOf(rectangle.getArea()));
                StoreShape.add(rectangle.getPerimeter());
            }

            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                strSide = in.nextLine();
                side = Double.parseDouble(strSide);
                Square square = new Square(side);
                square.calArea(side);
                square.calPerimeter(side);
                square.setName("Square");
                StoreShape.add(square.getName());
                square.setNumside(4);
                StoreShape.add(square.getNumside());
                StoreShape.add(String.valueOf(square.getArea()));
                StoreShape.add(square.getPerimeter());
            }

            if ("4".equals(choice)) {
                System.out.println("List all shape: ");
                Iterator var10 = StoreShape.iterator();

                while (var10.hasNext()) {
                    name = (String) var10.next();
                    System.out.println("Name: " + name + ", Number of side: " + var10.next() + ", Area: " + var10.next() + ", Perimeter: " + var10.next());
                }
            }

            if ("5".equals(choice)) {

            }


        } while(!"6".equals(choice));

        in.close();
    }
}