import java.util.Scanner;
public class Switch_And_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
            System.out.println("The numer is equal to 0");
            break;
            case 1:
            System.out.println("The number is equal to 1");
            break;
            case 2:
            System.out.println("The number is equal to 2");
            break;
            default:
            System.out.println("The number is  greater than  2");


    }
    scanner.close();
}
}
