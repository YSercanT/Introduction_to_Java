public class Break_And_Continue {
    public static void main(String[] args){
        System.out.println("Example of 'break' usage:");
        for (int i = 1; i <=512;i*=2){
            if(i>100){
                break;
            }
            System.out.println("i : "+i);
          
        }
        System.out.println("Example of 'continue' usage:");
        for (int i = 1; i <=512;i*=2){
            if(i>100 && i<=300){
                continue;
            }
            System.out.println("i : "+i);

        }
        }
    
}
