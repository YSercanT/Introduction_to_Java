public class BasicOperators {
    public static void main(String[] args){

        //Aritmatical Operators
        int a=5;
        int b=10;
        System.out.println("Sum of a and b:"+(a+b));//sum operation
        System.out.println("Diffference of a and b:"+ (a-b));//difference operation
        System.out.println("Multiplication of a and b:"+(a*b));//multiplication operation
        System.out.println("Division of a and b:"+(a/b));//division operation
        System.out.println("a mod b :"+(a%b));//modulus operation
        System.out.println("A :"+a);

        System.out.println("İncrement operation for a :"+(a++));//increment operation
        System.out.println("A :"+a);


        System.out.println("Decrement operation for a :"+(a--));//decrement operation
        System.out.println("A :"+a);
        System.out.println("İncrement operation for a :"+(++a));//increment operatio 
        System.out.println("A :"+a);

        System.out.println("Decrement operation for a :"+(--a));//decrement operation
        System.out.println("A :"+a);

        //Logical Operators
        boolean h=true;
        boolean t=false;
        System.out.println("And Operation with  h and t  : "+(h&t));//and operation
        System.out.println("Or Operation with  h and t : "+(h|t));//or operation
        System.out.println("Xor Operation with  h and t  : "+(h^t));//xor operation
        System.out.println("Not Operation with  h   : "+(!h));//not operation


        //Relational Operators
        System.out.println("Equal Operator with a and b: " + (a==b));
        System.out.println("NotEqual Operator with a and b: " + (a!=b));
        System.out.println("Greater Than Operator with a and b: " + (a>b));
        System.out.println("Greater Than or Equal to Operator with a and b: " + (a>=b));
        System.out.println("Less Than Operator with a and b: " + (a<b));
        System.out.println("Less Than or Equal to Operator with a and b: " + (a<=b));
    

        
        //Assignment Operators
        a=5;
        b=10;
        System.out.println("Assignment Operator   a plus b: " + (a+=b));
        System.out.println("A is : "+a);
        System.out.println("Assignment Operator   a minus b: " + (a-=b));
        System.out.println("A is : "+a);
        System.out.println("Assignment Operator   a multiply b: " + (a*=b));
        System.out.println("A is : "+a);
        System.out.println("Assignment Operator   a divide by b: " + (a/=b));
        System.out.println("A is : "+a);
        System.out.println("Assignment Operator   a mod b: " + (a%=b));
        System.out.println("A is : "+a);
        System.out.println("Assignment Operator a equal b: " + (a=b));
        System.out.println("A is : "+a);
        System.out.println("Hello World!");
        //Conditional Operators
        int x=20;
        int y=10;
        boolean c=((x/y)==10);
        System.out.println("Output of conditional operator is :"+c);
        c=(x>=y);
        System.out.println("Output of conditional operator is :"+c);
        c=(x<=y);
        System.out.println("Output of conditional operator is :"+c);
        String s=((x<y)) ? "Y is higher than x" : "X is higher than y";
        System.out.println("S is :"+s);
    }
}
