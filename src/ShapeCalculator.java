class ShapeCalculator {

    double squarePerimeter(Square square){
        return square.a * 4;
    }

    double squareArea(Square square){
        return Math.pow(square.a,2) ;
    }

    double rectanglePerimeter(Rectangle rectangle){
        return (rectangle.a *2) + (rectangle.b * 2);
    }

    double rectangleArea(Rectangle rectangle){
        return rectangle.a * rectangle.b;
    }

    double circlePerimeter(Circle circle){
        return 2 * Math.PI * circle.r;
    }

    double circleArea(Circle circle){
        return Math.PI * Math.pow(circle.r, 2);
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    double triangleArea(Triangle triangle){
        return triangle.a /2 * triangle.h;
    }



}
