import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of sides: ");
        int sides = sc.nextInt();
        System.out.println("Enter side length: ");
        int length = sc.nextInt();

        Shape shape;
        switch (sides){
            case 3:
                shape = new Triangle(length);
                break;
            case 4:
                shape = new Square(length);
                break;
            default:
                shape = new Shape(length);
        }
        shape.calculateShapeArea();


    }
}