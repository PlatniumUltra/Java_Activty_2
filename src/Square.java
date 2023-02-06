public class Square extends Shape{


    public Square(double sideLength){
        super(sideLength);
    }

    public void calculateShapeArea(){
        System.out.println("The Area of the Square is "+sideLength*sideLength);
    }
}