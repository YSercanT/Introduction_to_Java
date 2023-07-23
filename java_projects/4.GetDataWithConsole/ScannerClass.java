import java.util.Scanner;


public class ScannerClass {
    public static void main(String[] args){

        System.out.println("Lets take a input with  scanner class.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mumber one :");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number two :");
        int num2 = scanner.nextInt();
        System.out.print("Multiply of number one and number two  equals to  " +( num1*num2)+"\n");
        scanner.close();
    }
}
