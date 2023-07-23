public class if_else {
    public static void main(String[] args) {
    // if , else if and else statements are conditional statements
    int a = 100;
    int b = 20;
    int c =30;
    if (a>b){
        System.out.println("a is greater than b");
    }else if (a<b){
        System.out.println("a is less than b");

    }else{
        System.out.println("a is equal to b");
    }
    

    if(a<b && a<c){
        System.out.println("a is the shortest number.");

    }else if(b<a && b<c){
        System.out.println("b is the shortest number.");

    }else if(c<a && c<b){
        System.out.println("c is the shortest number.");
}
}
}

