import java.util.Scanner;
public class GCD_LCM {
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program finds the Greatest Common Divisor and  the Least Common Multiple of two numbers");
        System.out.print("Please enter the number 1 :");
        int n1=scanner.nextInt();
        System.out.print("Please enter the number 2 :");
        int n2=scanner.nextInt();
        int smaller=0;
        if(n1>n2){
            smaller=n2;
        }else if(n1<n2){
            smaller=n1;
        }else{
            System.out.println("LCM of this numbers is :"+n1);
            System.out.println("GCM of this numbers is :"+n1);
        }
        int GCD=0;
        int LCM=0;
        for(int i =1; i<=smaller; i++){
            if((n1%i==0)&& (n2%i==0)){
                GCD=i;
            }
        }
        LCM =(n1*n2)/GCD;
        System.out.println("LCM of this numbers is :"+LCM);
        System.out.println("GCM of this numbers is :"+GCD);


        scanner.close();
    }
    
}
