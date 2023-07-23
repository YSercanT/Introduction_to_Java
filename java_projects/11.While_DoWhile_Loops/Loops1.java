public class Loops1 {
    public static void main(String[] args){
        // The loops are  used to repeat a section of code an unknown number of times until a specific condition is met.
        // the syntax of while loops is determined by the following variables   to determine the condition
        //while(condition){ codes ..}
        int i =10;
        while(i>0){
            System.out.println("i : "+i);
            i--;

        }

        
        /*do while structre :
         * do { 
            codes ... 
        } while (condition);
         */
        int x=20;
        do{
            System.out.println("x : "+x);
            x--;
        }while (x>0);
    }
    
}
