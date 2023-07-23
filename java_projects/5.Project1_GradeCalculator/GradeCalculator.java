import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int midterm1 ;
        int midterm2;
        int final1;
        System.out.println("Grade Calculator");
        System.out.println("********************************");
        System.out.println("Enter midterm 1 grade : ");  
        midterm1 = scanner.nextInt();
        System.out.println("Enter midterm 2 grade : ");   
        midterm2 = scanner.nextInt();
        System.out.println("Enter Final grade : ");
        final1 = scanner.nextInt();
        double mean=(double)(midterm1+midterm2+final1)/3; 
        System.out.println("Average grade is equals to  "+mean);
        System.out.println("********************************");
        scanner.close();
        
    }
}
