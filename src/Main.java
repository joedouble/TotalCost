public class Main {

    public static void main(String[] args) {
        double salesTax = 0.06;
        double itemPrice = 200.51;
        double totalCost = itemPrice + (salesTax * itemPrice);

        if (totalCost <= 50) {
            System.out.println("Go for it!");
        } else if (totalCost > 50 & totalCost <= 100) {
            System.out.println("Are you sure about this?");
        } else {
            System.out.println("I'm hiding your credit card.");
        }
    }
}
