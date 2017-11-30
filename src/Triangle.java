public class Triangle {

    double a;
    double b;
    double c;
    double h;

    Triangle(double a, double h){
        this.a = a;
        this.b = a;
        this.c = a;
        this.h = h;
    }

    Triangle(double a, double b, double c, double h){
       this(a,h);
       this.b = b;
       this.c = c;
    }
}
