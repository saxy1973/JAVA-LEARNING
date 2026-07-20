import java.util.Scanner;

public class ProductBilling {

    public static double calculateTotalBill(double[] prices) {
        double sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        double tax = sum * 18 / 100;
        return sum + tax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int num = sc.nextInt();

        double[] prices = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        double totalBill = calculateTotalBill(prices);

        System.out.println("Total Bill (including 18% tax): " + totalBill);

        sc.close();
    }
}