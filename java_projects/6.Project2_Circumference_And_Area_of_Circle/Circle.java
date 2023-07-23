import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double pie=3.14;
        double radius;
        System.out.println("Please enter the radius of the circle : ");
        radius=scanner.nextDouble();
        double area=pie*radius*radius;
        System.out.println("The area of the circle is : "+area);
        double circumference = 2*pie*radius ;
        System.out.println("The circumference of the circle is : "+circumference);
        scanner.close();
    }
    
}
