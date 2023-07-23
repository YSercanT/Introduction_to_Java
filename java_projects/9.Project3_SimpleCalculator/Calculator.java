import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        /*
         * 1 is add operator 
         * 2 is subtract operator
         * 3 is multiply operator
         * 4 is divide operator
         * 
         */

        Scanner   scanner  = new Scanner(System.in);
        System.out.println("Welcome to Calculator System");
        System.out.println("Please enter  number one:");
        double number = scanner.nextDouble();
        System.out.println("Please enter number two:");         
        double number2 = scanner.nextDouble();
        System.out.println("Please select your operation ");
        System.out.println("1 is add operator \n" + 
                "2 is subtract operator\n" +
                "3 is multiply operator\n" +
                "4 is divide operator\n" 
                );
        int operation = scanner.nextInt();

        if(operation == 1){
            System.out.println("Output of addition is equal to : "+(number+number2) );

        }else if(operation == 2){
            System.out.println("Output of substraction is equal to :"+(number-number2));
        }else if(operation == 3){
            System.out.println("Output of multiplication is equal to :"+(number*number2));
        }else if(operation == 4){
            System.out.println("Output of division is equal to :"+(number/number2));
    
        }else {
            System.out.println("İnvalid Entry.Please check your input arguments...");
        }
    
    
        scanner.close();
        }
        
    
}
