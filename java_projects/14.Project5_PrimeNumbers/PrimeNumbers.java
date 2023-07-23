import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args){
        System.out.println("Program for finding prime numbers from 0 to the number you specify.");
        System.out.println("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        int the_number =scanner.nextInt();
        int counter =0;
        for (int i = 2; i <=the_number;i++){
            for (int j = 2; j < i;j++){
                if(i %j ==0){
                    counter=1;
                    break;
                }
            }
            if(counter==0){
            System.out.println(i+ " is prime number ");
            }else{
                counter=0;
            }
          
        }
    scanner.close();
    }   
}
