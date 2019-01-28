import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salesTax = 0.06;
        double itemPrice = 0;
        double totalCost = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the price of the item you'd like to buy?");
        itemPrice = myScanner.nextDouble();

        totalCost = itemPrice + (salesTax * itemPrice);

        System.out.print("The total cost of the item is $" + totalCost + ". ");

        if (totalCost <= 50) {
            System.out.println("Go for it!");
        } else if (totalCost > 50 & totalCost <= 100) {
            System.out.println("Are you sure about this purchase?");
        } else if (totalCost > 100){
            System.out.println("I'm hiding your credit card.");
        }
    }
}
