public class Triangle extends Shape{
    double length;
    double height;

    Triangle(double length, double height) {
        this.height = height;
        this.length = length;

    }

    @Override
    double area(){
        return 0.5 * (height*length);
    }
}
