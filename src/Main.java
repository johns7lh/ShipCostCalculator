import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double shippingCost = 0;

        System.out.println("Enter the price of your item: ");
        price = in.nextInt();

        If (price <=100){
                shippingCost = 0;
        System.out.println("The total cost is: " + price);
        }
		else{
        shippingCost = price * .02
    } System.out.println("The total cost is: " +shippingCost +price);
    }
}