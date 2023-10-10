import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double price = 0;
        double cost100;
        double distance;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;


        do{
            System.out.println("Enter Current Number of Gallons of Gasoline in Vehicle:");
            if (scan.hasNextDouble()) {
                gallons = scan.nextDouble();
                scan.nextLine();
                if (gallons >= 0){
                    done1 = true;
                } else {
                    System.out.println("The value you entered was incorrect. Please try again.");
                }
            } else {
                System.out.println("The value you entered was incorrect. Please try again.");
                scan.nextLine();
            }
        } while(!done1);

        do{
            System.out.println("Enter Fuel Efficiency in MPG:");
            if (scan.hasNextDouble()) {
                mpg = scan.nextDouble();
                scan.nextLine();
                if (mpg > 0){
                    done2 = true;
                } else {
                    System.out.println("The value you entered was incorrect. Please try again.");
                }
            } else {
                System.out.println("The value you entered was incorrect. Please try again.");
                scan.nextLine();
            }
        } while(!done2);
        do{

            System.out.println("Enter Current Price for Gallon of Gas:");
            if (scan.hasNextDouble()) {
                price = scan.nextDouble();
                scan.nextLine();
                if (price > 0){
                    done3 = true;
                } else {
                    System.out.println("The value you entered was incorrect. Please try again.");
                }
            } else {
                System.out.println("The value you entered was incorrect. Please try again.");
                scan.nextLine();
            }
        } while(!done3);
         cost100 = (100/mpg) * price;
         distance = gallons * mpg;
        System.out.printf("Cost per 100 miles in $: %-8.2f", cost100);
        System.out.printf("\nDistance left in Miles : %-8.2f", distance);
    }
}