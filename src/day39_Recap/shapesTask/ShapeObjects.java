package day39_Recap.shapesTask;

public class ShapeObjects {

    public static void main(String[] args) {

      Square square = new Square(10);
        System.out.println(square);
        System.out.println(square.getName());

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle);
        rectangle.setWidth(5);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());

        Circle circle = new Circle(10);
        System.out.println(circle);
        circle.setRadius(5);
        System.out.println(circle);
        System.out.println(circle.getName());


    }
}
