public class Triangle extends Shape {
    
    double Height;
    double Base;
    
    public Triangle(double Base, double Height) {
        super();
        this.Height = Height;
        this.Base = Base;

    }
    public double getArea() {
        return (Height * Base) / 2;
    }
}
