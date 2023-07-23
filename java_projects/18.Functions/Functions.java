public class Functions {
    static void sayHello(){
        System.out.println("Hello!");
    }
    static void find_square(int x){
        System.out.println("Square of the "+x+" is  "+ (Math.sqrt(x)));
    }
    static void power(int x, int y){
        int tmp=1;
        for (int i = 1; i <=y;i++){
            tmp*=x;
        }
        System.out.println("The result is :"+tmp);

    }
    public static void main(String[] args){
        sayHello();
        find_square(16);
        power(2, 4);
    }

 
}
