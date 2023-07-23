import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        
        
        Scanner scanner = new Scanner(System.in);
        //Fibonacci sequence is  0,1,1,2,3 5,8,13,21,34  ...
        int s0=0;
        int s1=1;
        int number;
        System.out.println("How many elements of the Fibonacci series would you like to display?");
        System.out.print("Please enter the number of elelements you wish to display: ");
        number =scanner.nextInt();
        System.out.print(s0+" , "+s1);
        for (int i=3; i<=number; i++){
            int tmp=s1+s0;
            s0=s1;
            s1=tmp;
            
            System.out.print(" , "+ tmp);
           
        }
        System.out.println();

        scanner.close();
    }
}
