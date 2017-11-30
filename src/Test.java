public class Test {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Square square1 = new Square(5);
        System.out.println("Bok kwadratu : " + square1.a);
        System.out.println(calculator.squarePerimeter(square1));
        System.out.println(calculator.squareArea(square1));

        Rectangle rectangle1 = new Rectangle(2, 4);
        System.out.println("Prostokąt - Bok a: " + rectangle1.a + " Bok b: " + rectangle1.b);
        System.out.println(calculator.rectangleArea(rectangle1));
        System.out.println(calculator.rectanglePerimeter(rectangle1));

        Circle circle1 = new Circle(5);
        System.out.println("Promień koła : " + circle1.r);
        System.out.println(calculator.circleArea(circle1));
        System.out.println(calculator.circlePerimeter(circle1));

        Triangle triangle1 = new Triangle(2,3,4,2);
        System.out.println("Trójkąt - Bok 1 :" + triangle1.a + " Bok 2 : " + triangle1.b + " Bok 3 : " + triangle1.c + " Wysokość : " + triangle1.h);
        System.out.println(calculator.triangleArea(triangle1));
        System.out.println(calculator.trianglePerimeter(triangle1));

    }
}
