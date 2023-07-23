
public class Armstrong {
    public static void main(String[] args){
        /*
         * A number is called an Armstrong number 
         * if the sum of the individual cubes of all
         *  digits in the digits is equal to itself.
         */

        System.out.println("This program will list armstrong numbers from 0 to 999.  ");

  
        for (int i=0;i<=999;i++){
            if (i<=9){
                System.out.println(i+" is an armstrong number.");
            }else {
                int tmp=i;
                int ones,tens,hundereds;
                ones=tmp%10;
                tmp/=10;
                tens=tmp%10;
                tmp/=10;
                hundereds=tmp%10;
                
                if(i==Math.pow(ones,3)+ Math.pow(tens,3) + Math.pow(hundereds,3)){
                   System.out.println(i+" is an armstrong number."); 
                }
                

            }

        }
    

    }
}
