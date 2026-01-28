public class Square extends Shape{
    double length;

    Square(double length){
        this.length = length;
    }

    @Override
    double area(){
        return length * length;
    }
}
