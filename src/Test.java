public class Test {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Square square1 = new Square(5);

        System.out.println(square1.a);

        System.out.println(calculator.squarePerimeter(square1));

    }
}
