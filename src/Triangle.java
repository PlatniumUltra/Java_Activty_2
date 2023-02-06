public class Triangle  extends Shape{


    public Triangle(double sideLength){
        super(sideLength);
    }

    public void calculateShapeArea(){
        System.out.println("The Area of the Triangle  is " + 0.5 * sideLength * sideLength);
    }
}