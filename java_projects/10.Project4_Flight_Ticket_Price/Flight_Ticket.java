import java.util.Scanner;
public class Flight_Ticket {
    public static void main(String[] args){
        /*
         * kilometer unit price = 0.10$
         * if younger than 12 years old  : %50 discount
         * if younger than 24 years old  : %10 discount
         * if older than 65 years old    : %30 discount
         * If a round-trip ticket is purchased : %20 discount
         * Program that calculates flight tickets according to these conditions
         */
        int km ,age, flight_type;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the distance to your destination(Km) :");
        km = scanner.nextInt();
        System.out.print("Please enter your age (years) :");
        age= scanner.nextInt();
        System.out.println("Please enter your flight type(Type 1 is One way , Type 2 is round trip) : ");
        flight_type = scanner.nextInt();
        //Input Control 
        if((km>0) && (age>0) &&(flight_type==1 || flight_type==2)){
            int discount1=0,discount2=0 ;
            if(flight_type==2){
                discount1 =20;
                km*=2;
            }else{
                discount1 =0;
            }
            if(age<=12){
                discount2=50;
            }else if (age<=24){
                discount2 =10;
            }else if (age>=65){
                discount2 =30;
            }else{
                discount2=0;
            }
            System.out.println("Discount1="+discount1);
            System.out.println("Discount2="+discount2);
            int total_discount =discount1+discount2;
            double tmp=(double)(100-total_discount);
            double price1=(double)(km/10)*(tmp/100);
            System.out.println("The price of this flight is : "+price1 +"$");
        }
        else{
            System.out.println("Invalid inputs.Please check your inputs and try again...");
        }
        scanner.close();
    }
    
}
